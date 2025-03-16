package Practice_10_MultiThreads.Task25_CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Dock {
    //25. Имитация работы склада с CountDownLatch
    //Создайте систему склада, где 5 рабочих загружают товар, и после их завершения грузовик (Thread) может уехать.
    //Используйте CountDownLatch(5), чтобы грузовик ждал, пока все рабочие завершат загрузку.
    //Рабочие (Runnable) выполняют загрузку (симуляция через sleep()).
    //После завершения работы всех потоков грузовик выводит "Грузовик уезжает".

    public static void main(String[] args) throws InterruptedException {
        ExecutorService loader = Executors.newFixedThreadPool(5);
        CountDownLatch countDownLatch = new CountDownLatch(5);
        Runnable load = () -> {
            System.out.println("Рабочий загружает груз... ID рабочего - " + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Рабочий не может выполнить загрузку");
            }
            countDownLatch.countDown();
        };

        for (int i = 1; i <= 5 ; i++) {
            loader.submit(load);
        }

        countDownLatch.await();
        System.out.println("Все загрузки завершены. Грузовик уезжает");

        loader.shutdown();
        loader.awaitTermination(10, TimeUnit.SECONDS);
    }
}
