package Threads;

public class ThreadAnonymous {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runna thread");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
