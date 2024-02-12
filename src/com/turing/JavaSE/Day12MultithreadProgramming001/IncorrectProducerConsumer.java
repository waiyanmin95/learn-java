package turing.JavaSE.Day12MultithreadProgramming001;

class Queue {
    int n;

    synchronized int get() {
        System.out.println("Got: " + n);
        return this.n;
    }

    synchronized void put(int n) {
        System.out.println("Put: " + n);
        this.n = n;
    }
}

class Producer implements Runnable {
    Queue q;
    Thread thread;

    Producer(Queue q) {
        this.q = q;
        this.thread = new Thread(this);
    }

    public void start() {
        this.thread.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }

}

class Consumer implements Runnable {
    Queue q;
    Thread thread;

    Consumer(Queue q) {
        this.q = q;
        this.thread = new Thread(this);
    }

    public void start() {
        this.thread.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("Got By Consumer " + q.get());
        }
    }
}

public class IncorrectProducerConsumer {
    public static void main(String[] args) {
        Queue q = new Queue();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.start();
        c.start();
    }
}
