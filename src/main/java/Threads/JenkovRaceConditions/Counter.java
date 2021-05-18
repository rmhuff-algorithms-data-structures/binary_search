package Threads.JenkovRaceConditions;

public class Counter {

    private long count = 0;

    // this method is called the critical section
    // it is where the race conditions occur
    public long incAndGet() {
        // this count appears to be a singular instruction
        // in the virtual machine it is actually multiple instructions
        // this is reason threads get tangled each counter is 3 states in the JVM
        // to solve this we must make the critical section atomic
        this.count++;
        return this.count;
    }

    public long get() {return this.count;}
}
