package Threads.JenkovRaceConditions;


public class SynchronizedCounter {

    private long count = 0;

    public long incAndGet() {
        //ReentrantLock
        synchronized (this) {
            this.count++;
            return this.count;
        }
    }

    public long get() {
        synchronized (this) {
            return this.count;
        }
    }
}
