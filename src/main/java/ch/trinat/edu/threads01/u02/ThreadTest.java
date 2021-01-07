package ch.trinat.edu.threads01.u02;

public class ThreadTest {
    public static void main(String[] args) {
        Runnable threadJob = new ch.trinat.edu.threads01.u02.MyRunnable();
        Thread myThread = new Thread(threadJob);
        myThread.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("back to main");
    }
}
