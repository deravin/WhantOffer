package Practice_10_MultiThreads.Task21_LiveLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LiveLockExample {
    public static void main(String[] args) {
        //21. Livelock
        //Создайте ситуацию livelock, когда два потока пытаются избежать deadlock, но в итоге бесконечно уступают друг другу ресурс.
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Thread t1 = new Thread(() ->{
            while (true){
                if (lock1.tryLock()) {
                    try {
                        System.out.println("Поток 1 захватил замок 1");
                        if (lock2.tryLock()) {
                            try {
                                System.out.println("Поток 1 захватил замок 2");
                            } finally {
                                lock2.unlock();
                            }
                        } else {
                            System.out.println("не удалось захватить ресурс");
                        }
                    } finally {
                        lock1.unlock();
                    }
                }
            }
        });
        Thread t2 = new Thread(() ->{
            while (true){
                if (lock2.tryLock()) {
                    try {
                        System.out.println("Поток 2 захватил замок 2");
                        if (lock1.tryLock()) {
                            try {
                                System.out.println("Поток 2 захватил замок 1");
                            } finally {
                                lock1.unlock();
                            }
                        } else {
                            System.out.println("не удалось захватить ресурс");
                        }
                    } finally {
                        lock2.unlock();
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}
