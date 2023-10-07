package JavaSE.Day13;

import java.util.concurrent.Semaphore;

class Queue {
    int n;
    static Semaphore sConsumer = new Semaphore(0);
    static Semaphore sProducer = new Semaphore(1);

    public void get() {
        // first time going to fail a case
        try {
            sConsumer.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Got N: " + n);
        sProducer.release(); // Hey Producer, release // C to P Communication
    }

    public void put(int num) {

        try {
            sProducer.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.n = num;
        System.out.println("Put N: " + n);
        sConsumer.release(); // C to P Communication
    }
}

class Producer extends Thread {
    Queue q;

    public Producer(Queue q) {
        this.q = q;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            this.q.put(i);
        }
    }
}

class Consumer extends Thread {
    Queue q;

    public Consumer(Queue q) {
        this.q = q;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            this.q.get();
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Queue q = new Queue();

        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        c.start();
        p.start();
    }
}
