package ch.trinat.edu.threads01.u09;


class StopThread extends Thread {
    private boolean stopped = false;

    public StopThread() {
        start();
    }
    public synchronized void stopThread() {
        stopped = true;
    }

    public synchronized boolean isStopped() {
        return stopped;
    }

    public void run() {
        int i = 0;
        while (!isStopped()) {
            i++;
            System.out.println("Hello World (" + i + ")");
        }
        System.out.println("Thread ending now");
    }
}
