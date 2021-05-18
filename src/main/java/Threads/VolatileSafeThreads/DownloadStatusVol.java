package Threads.VolatileSafeThreads;

public class DownloadStatusVol {

    private volatile boolean isDone;
    private int totalBytes;
    private int totalFiles;
    private Object totalBytesLock = new Object();

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        synchronized (totalBytesLock) {totalBytes++;}
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}
