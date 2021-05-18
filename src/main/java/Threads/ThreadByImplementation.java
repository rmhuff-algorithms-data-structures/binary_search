package Threads;

public class ThreadByImplementation implements Runnable{
    @Override
    public void run() {
        System.out.println("Runna thread;");

    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadByImplementation());
        thread.start();
    }
}
