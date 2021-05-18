package Threads.AtomicThreadSafety;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

public class DownloadStatusAtomic {

    // ATOMIC OBJECTS
    /*private AtomicInteger totalBytes = new AtomicInteger();

    public int getTotalBytes() {
        return totalBytes.get();
    }

    public void incrementTotalBytes() {
        totalBytes.incrementAndGet();
    }*/


    private LongAdder totalBytes = new LongAdder();
    public int getTotalBytes() {
        return totalBytes.intValue();
    }

    public void incrementTotalBytes() {
        totalBytes.increment();
    }

}
