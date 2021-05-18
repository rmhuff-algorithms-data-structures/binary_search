package Threads.ConfinementSafeThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ConfinementDemo {

    public static void main(String[] args) {

        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTaskCon> tasks = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            DownloadFileTaskCon task = new DownloadFileTaskCon();
            tasks.add(task);

            Thread thread = new Thread(task);
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

        Optional<Integer> totalBytes = tasks.stream()
                .map(t -> t.getStatus().getTotalBytes())
                .reduce(Integer::sum);


        System.out.println(totalBytes);
    }
}
