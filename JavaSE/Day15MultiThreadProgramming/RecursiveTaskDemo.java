package JavaSE.Day15MultiThreadProgramming;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class Sum extends RecursiveTask<Double> {
    final int threshold = 1000;
    double[] data;
    int start, end;

    public Sum(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Double compute() {
        double sum = 0;
        if ((end - start) < threshold) {
            for (int i = start; i < end; i++) {
                sum += data[i];
            }
        } else {
            int middle = (start + end) / 2;

            // Invoke new tasks, using the subdivided data
            Sum SubTask1 = new Sum(data, start, middle);
            Sum SubTask2 = new Sum(data, middle + 1, end);

            // Start each task by forking.
            SubTask1.fork();
            SubTask2.fork();

            // Wait for the subtasks to return and aggregate the results.
            sum = SubTask1.join() + SubTask2.join();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("SUM AFTER: " + sum);
            // System.out.println("Middle return " + middle + " Sum " + sum);

        }
        return sum;
    }
}

public class RecursiveTaskDemo {
    public static void main(String[] args) {
        double result;
        try (ForkJoinPool pool = new ForkJoinPool()) {

            double[] numbers = new double[10000];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = i;
            }
            Sum job = new Sum(numbers, 0, numbers.length);

            // Invoke return result
            result = pool.invoke(job);
        }

        System.out.println("Result " + result);
    }
}
