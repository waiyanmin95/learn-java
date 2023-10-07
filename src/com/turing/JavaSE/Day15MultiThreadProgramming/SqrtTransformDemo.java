package JavaSE.Day15MultiThreadProgramming;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class SqrtTransform extends RecursiveAction { // RecursiveAction > No Return
    final int threshold = 1000;
    double[] data;
    int start, end;

    public SqrtTransform(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if ((end - start) < threshold) {
            // Transform each element into it square root
            for (int i = start; i < end; i++) {
                data[i] = Math.sqrt(i);
            }
        } else { // Otherwise, continue to break the data into smaller pieces. ( Divide and Conquer )
            int middle = (start + end) / 2;
            invokeAll(new SqrtTransform(data, start, middle), new SqrtTransform(data, middle + 1, end));
        }
    }
}

public class SqrtTransformDemo {
    public static void main(String[] args) {
        double[] nums;
        try (ForkJoinPool pool = new ForkJoinPool()) {

            nums = new double[10000];

            for (int i = 0; i < nums.length; i++) {
                nums[i] = i;
            }
            SqrtTransform job = new SqrtTransform(nums, 0, nums.length);
            pool.invoke(job);
            // pool.execute(job); // execute didn't wait and block,
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("SquareRoot Values: " + nums[i]);
        }
    }
}
