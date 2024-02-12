package turing.JavaSE.Day12MultithreadProgramming001;

class Data {
    int count;
}

class IncreaseThread extends Thread {
    final Data data;

    public IncreaseThread(Data d) {
        this.data = d;
    }

    public void run() {
        for (int i = 0; i < 100000; i++) {
            synchronized (this.data) { // Lock, Monitor
                this.data.count++; // Critical Section, Race Condition Can Happen
            }
        }
    }
}

public class MutualExclusionProblem {
    public static void main(String[] args) {
        Data x = new Data();

        IncreaseThread th1 = new IncreaseThread(x);
        IncreaseThread th2 = new IncreaseThread(x);
        IncreaseThread th3 = new IncreaseThread(x);

        th1.start();
        th2.start();
        th3.start();

        System.out.println("Thread 1 isAlive ? = " + th1.isAlive());
        try {
            th1.join();
            th2.join();
            th3.join();
            System.out.println("Count " + x.count);
            System.out.println("Thread 1 isAlive ? = " + th1.isAlive());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
