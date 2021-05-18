package Threads.ConfinementSafeThreading;

public class DownloadStatusCon {

    private int totalBytes;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        totalBytes++;
    }
}
