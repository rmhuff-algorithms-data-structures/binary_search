package Threads.VolatileSafeThreads;

public class DownloadFileTaskVol implements Runnable{

    private DownloadStatusVol status;

    public DownloadFileTaskVol(DownloadStatusVol status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());

        //each hypothetical is 10,000 bytes
        for (int i = 0; i < 1_000_000; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }
        status.done();
        synchronized (status) {
        status.notifyAll();
        }

        System.out.println("Download complete: " + Thread.currentThread().getName());
    }

    public DownloadStatusVol getStatus() {
        return status;
    }

}
