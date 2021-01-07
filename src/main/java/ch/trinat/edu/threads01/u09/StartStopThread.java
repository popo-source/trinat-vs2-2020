package ch.trinat.edu.threads01.u09;

public class StartStopThread {
    public static void main(String[] args) {
        StopThread st = new StopThread();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.err.println("Sleeping Error");
        }
        System.out.println("Main task sleep over");
        st.stopThread();
        System.out.println("Main task ends now");
    }

}

