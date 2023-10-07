package JavaSE.Day13;

import java.util.concurrent.Semaphore;

class Worker implements Runnable {

    private final Semaphore semaphore;
    private final Thread thread;
    private final String name;

    public void start() {
        this.thread.start();
    }

    public Worker(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
        this.thread = new Thread(this);
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " is trying to acquire a permit.");
            semaphore.acquire(); // acquire
            System.out.println(name + " has acquired a permit.");
            for (int i = 0; i < 5; i++) {
                System.out.println(name + " is working now");
            }
            System.out.println(name + " done");
            System.out.println(name + " is releasing the permit.");
            semaphore.release(); // release
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class SemaphoreAlter {
    public static void main(String[] args) {
        Semaphore s = new Semaphore(2);
        Worker worker1 = new Worker(s, "Worker 1");
        Worker worker2 = new Worker(s, "Worker 2");
        Worker worker3 = new Worker(s, "worker 3");

        worker1.start();
        worker2.start();
        worker3.start();
    }
}