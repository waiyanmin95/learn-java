package JavaSE.Synchronizers;

// Generally > Multi Producers, Single Consumer
// Like its name, countdown 5,4,3,2,1
// await(), when equal zero (0), unlocked/resume


// Pseudocode
// Main Thread starting
// CD = 3 ( Main Thread )
// await() , Main Thread waiting, waiting 3 threads
// countDown(); > CD-- // 2,
// countDown(); > CD-- // 1,
// countDown(); > CD-- // 0,
// When CD == 0, Main Thread resume

import java.util.concurrent.CountDownLatch;

class CDThread extends Thread {
    CountDownLatch latch;

    public CDThread(CountDownLatch newLatch) {
        this.latch = newLatch;
    }

    @Override
    public void run() {
        for (int i = 4; i >= 0; i--) {
            System.out.println(i);
            this.latch.countDown(); // Decrease count
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class CountDownLatchDemo {
    public static void main(String[] args) {
        // Main Thread starting
        System.out.println("Starting");

        // CD = 5 ( Main Thread )
        CountDownLatch cdl = new CountDownLatch(5);

        // Threads Initialize
        CDThread th1 = new CDThread(cdl);
        th1.start();

        try {
            System.out.println("Start calling await()");
            cdl.await(); // await() , Main Thread waiting, waiting other threads
            System.out.println("Done ...");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
