package Practice_10_MultiThreads.Task17_18_AtomicInt;

import java.util.concurrent.atomic.AtomicInteger;

public class IncrementAtimic {
    // 17. Потокобезопасный счетчик
    // Создайте AtomicInteger и используйте его в двух потоках, которые инкрементируют значение 1000 раз каждый.
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger i = new AtomicInteger();
        Thread t1 = new Thread(() -> {
            for (int j = 1; j <= 1000; j++) {
                i.incrementAndGet();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int j = 1; j <= 1000; j++) {
                i.incrementAndGet();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(i);

    }
}
