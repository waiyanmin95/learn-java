package JavaSE.Day13;

import java.util.concurrent.Semaphore;

class Shared {
    static int count = 0;
}

class PlusThread extends Thread {
    String name;
    Semaphore s;

    public PlusThread(String name, Semaphore s) {
        super(name);
        this.name = name;
        this.s = s;
    }

    @Override
    public void run() {
        System.out.println("Starting Thread: " + name);
        try {
            System.out.println("Waiting for permit: " + name);
            s.acquire();
            System.out.println("!!! Permit Granted !!! " + name);
            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println("Shared count " + Shared.count);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Releasing permit: " + name);
            s.release();
        }
    }
}

class MinusThread extends Thread {
    String name;
    Semaphore s;

    public MinusThread(String name, Semaphore s) {
        super(name);
        this.name = name;
        this.s = s;
    }

    @Override
    public void run() {
        System.out.println("Starting Thread: " + name);
        try {
            System.out.println("Waiting for permit: " + name);
            s.acquire();
            System.out.println("!!! Permit Granted !!! " + name);
            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println("Shared count " + Shared.count);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Releasing permit: " + name);
            s.release();
        }
    }
}

public class SemaphoreDemo2 {
    public static void main(String[] args) {
        Semaphore s = new Semaphore(1);
        PlusThread plus = new PlusThread("Plus ", s);
        MinusThread minus = new MinusThread("Minus ", s);

        plus.start();
        minus.start();

        try {
            plus.join();
            minus.join();
            System.out.println("Final Shared Count: " + Shared.count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
