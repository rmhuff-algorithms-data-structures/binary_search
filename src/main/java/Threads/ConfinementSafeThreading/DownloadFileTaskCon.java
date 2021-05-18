package Threads.ConfinementSafeThreading;

public class DownloadFileTaskCon implements Runnable{

    private DownloadStatusCon status;

    public DownloadFileTaskCon() {
        this.status = new DownloadStatusCon();
    }

    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());

        //each hypothetical is 10,000 bytes
        for (int i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }

        System.out.println("Download complete: " + Thread.currentThread().getName());
    }

    public DownloadStatusCon getStatus() {
        return status;
    }

}
