package Threads.AtomicThreadSafety;

public class DownloadFileTaskAtomic implements Runnable{

    private DownloadStatusAtomic status;

    public DownloadFileTaskAtomic(DownloadStatusAtomic status) {
        this.status = status;
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

    public DownloadStatusAtomic getStatus() {
        return status;
    }

}
