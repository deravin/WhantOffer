package Practice_10_MultiThreads.Task17_18_AtomicInt;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCompareAndSet {
    // 18. Использование compareAndSet()
    //Создайте AtomicInteger с начальным значением 0. Используйте compareAndSet() для обновления переменной, если её текущее значение равно 0.
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger i = new AtomicInteger(0);
        Thread t1 = new Thread(() -> {
            i.compareAndSet(0, 100);
        });
        t1.start();
        t1.join();
        System.out.println(i);

    }
}
