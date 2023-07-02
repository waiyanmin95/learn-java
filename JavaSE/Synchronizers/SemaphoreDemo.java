package JavaSE.Synchronizers;

// Generally > Permit Threads
// permit = 3
// lock()

// Pseudocode
// permit = 3
// before critical session
// acquire() > permit-- //2, still okay until permit zero (0)
// acquire() > permit-- //1, still okay until permit zero (0)
// acquire() > permit-- //0,
// CRITICAL SESSION HERE
// if we don't release, that can lead to deadlock.
// release() > permit++ //1,
// release() > permit++ //2,
// release() > permit++ //3,


import java.util.concurrent.Semaphore;

class Data {
    int count;
}

class IncreaseThread extends Thread {
    Data data;
    Semaphore semaphore;

    public IncreaseThread(Data d, Semaphore s) {
        this.data = d;
        this.semaphore = s;
    }

    public void run() {
        for (int i = 0; i < 100000; i++) {
            try {
                this.semaphore.acquire(); // permit--
                this.data.count++; // CRITICAL SESSION
                this.semaphore.release(); // permit++
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class SemaphoreDemo {
    public static void main(String[] args) {
        Data d = new Data();
        Semaphore sem = new Semaphore(1);

        IncreaseThread th1 = new IncreaseThread(d, sem);
        IncreaseThread th2 = new IncreaseThread(d, sem);
        IncreaseThread th3 = new IncreaseThread(d, sem);

        th1.start();
        th2.start();
        th3.start();

        try {
            System.out.println("Thread 1 alive? = " + th1.isAlive());
            System.out.println("Thread 3 alive? = " + th3.isAlive());
            System.out.println("Thread 2 alive? = " + th2.isAlive());
            th1.join();
            th2.join();
            th3.join();
            System.out.println("Count: " + d.count);
            System.out.println("Thread 1 alive? = " + th1.isAlive());
            System.out.println("Thread 3 alive? = " + th3.isAlive());
            System.out.println("Thread 2 alive? = " + th2.isAlive());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
