package JavaSE.Day13;

class NewThread implements Runnable {
    String name;
    Thread thread;
    boolean suspendFlag;

    public NewThread(String name) {
        this.name = name;
        this.thread = new Thread(this);
        this.suspendFlag = false;
        this.thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println("Thread " + name + " i " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void start() {
        this.thread.start();
    }

    public synchronized void suspend() {
        this.suspendFlag = true;
    }

    public synchronized void resume() {
        this.suspendFlag = false;
        notify();
    }

}

public class SuspendDemo {
    public static void main(String[] args) {
        NewThread th1 = new NewThread("One");
        NewThread th2 = new NewThread("Two");

        try {
            Thread.sleep(1000);
            th1.suspend();
            System.out.println("Suspending Thread1");

            Thread.sleep(1000);
            th1.resume();
            System.out.println("Resuming Thread1");

            Thread.sleep(1000);
            th2.suspend();
            System.out.println("Suspending Thread2");

            Thread.sleep(1000);
            th2.resume();
            System.out.println("Resuming Thread2");
        } catch (Exception e) {
            System.out.println("Main thread Interrupted");
            e.printStackTrace();
        }
    }
}
