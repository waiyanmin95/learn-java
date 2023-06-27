package JavaSE.Day12MultithreadProgramming001;

class Queue1 {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return this.n;
    }

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        valueSet = true;
        this.n = n;
        System.out.println("Put: " + n);
        notify();
    }
}


class Producer1 implements Runnable {
    Queue1 q;
    Thread thread;

    Producer1(Queue1 q) {
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

class Consumer1 implements Runnable {
    Queue1 q;
    Thread thread;

    Consumer1(Queue1 q) {
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
            q.get();
        }
    }
}

public class CorrectProducerConsumer {
    public static void main(String[] args) {
        Queue1 q = new Queue1();
        Producer1 p = new Producer1(q);
        Consumer1 c = new Consumer1(q);

        p.start();
        c.start();
    }
}
