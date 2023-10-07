package JavaSE.Day12MultithreadProgramming001;

class CountThread extends Thread {
    String name;

    public CountThread(String name) {
        this.name = name;
    }

    // Thread execute code block > run()
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + name + " " + i);
        }
    }
}

public class CountThreadDemo {
    public static void main(String[] args) {
        CountThread th1 = new CountThread("One");
        CountThread th2 = new CountThread("Two");
        CountThread th3 = new CountThread("Three");

        System.out.println("CPUs : " + Runtime.getRuntime().availableProcessors());
        th1.setPriority(Thread.MAX_PRIORITY); // MAX 10
        th3.setPriority(Thread.NORM_PRIORITY); // DEFAULT 5
        th3.setPriority(Thread.MIN_PRIORITY); // MINIMUM 1
        System.out.println("Thread 1 Priority = " + th1.getPriority());
        th1.start();
        System.out.println("Thread 2 Priority = " + th2.getPriority());
        th2.start();
        System.out.println("Thread 3 Priority = " + th3.getPriority());
        th3.start();
    }
}
