package Threads;

public class ThreadLambda {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Lambda Thread");
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
