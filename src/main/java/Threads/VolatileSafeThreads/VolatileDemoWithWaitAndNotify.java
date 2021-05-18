package Threads.VolatileSafeThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VolatileDemoWithWaitAndNotify {

    public static void main(String[] args) {
        DownloadStatusVol status = new DownloadStatusVol();

        Thread thread1 = new Thread(new DownloadFileTaskVol(status));
        Thread thread2 = new Thread(() -> {
            while (!status.isDone()) {
                synchronized (status) {
                    try {
                        status.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println(status.getTotalBytes());
        });

        thread1.start();
        thread2.start();
    }
}
