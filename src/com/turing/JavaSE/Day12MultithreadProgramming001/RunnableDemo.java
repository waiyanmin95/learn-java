package turing.JavaSE.Day12MultithreadProgramming001;

class JustThread implements Runnable {

    Thread thread;

    JustThread() {
        this.thread = new Thread(this);
    }

    void start() {
        this.thread.start();
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Thread.name " + this.thread.getName() + " " + i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        JustThread th1 = new JustThread();
        JustThread th2 = new JustThread();

        th1.start();
        th2.start();
    }
}
