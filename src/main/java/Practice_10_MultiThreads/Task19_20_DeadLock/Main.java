package Practice_10_MultiThreads.Task19_20_DeadLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//         19. Создание deadlock
//        Создайте два ресурса (Lock lock1 и Lock lock2). Запустите два потока, где:
//        Поток 1 захватывает lock1, а затем lock2.
//        Поток 2 захватывает lock2, а затем lock1.
//        Запустите программу и убедитесь, что она зависает.

//        20. Избежание deadlock с tryLock()
//        Используйте tryLock() вместо lock() для предотвращения deadlock.
//        Если поток не может захватить второй lock в течение 1 секунды, он должен освободить первый lock.

        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Thread t1 = new Thread(() -> {
            while (true){
                try {
                    if (lock1.tryLock(1, TimeUnit.SECONDS)){
                        try {
                            if (lock2.tryLock(1, TimeUnit.SECONDS)){ // ждем ответа от второго замка, но не больше 1 сек.
                                try {
                                    System.out.println("Thread1 захватил оба замка");
                                    break; // чтобы выйти из цикла если оба замка захвачены
                                } finally {
                                    lock2.unlock(); // разблокируем ресурс 2
                                }
                            }
                        } finally {
                            lock1.unlock(); // разблокируем ресурс 1
                        }
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (true){
                try {
                    if (lock2.tryLock(1, TimeUnit.SECONDS)){
                        try {
                            if (lock1.tryLock(1, TimeUnit.SECONDS)){ // ждем ответа от второго замка, но не больше 1 сек.
                                try {
                                    System.out.println("Thread2 захватил оба замка");
                                    break; // чтобы выйти из цикла если оба замка захвачены
                                } finally {
                                    lock1.unlock(); // разблокируем ресурс 2
                                }
                            }
                        } finally {
                            lock2.unlock(); // разблокируем ресурс 1
                        }
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();

    }
}
