package Threads.AtomicThreadSafety;

import Threads.VolatileSafeThreads.DownloadStatusVol;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AtomicAndAddersDemo {

    public static void main(String[] args) {
        DownloadStatusAtomic status = new DownloadStatusAtomic();

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTaskAtomic(status));
            thread.start();
            threads.add(thread);
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(status.getTotalBytes());
    }
}
