package Practice_10_MultiThreads.Task3;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Запустите 5 потоков, каждый из которых выводит своё имя
        // (Thread.currentThread().getName()) и засыпает на случайное время (от 1 до 3 секунд).
        Random random = new Random();

        Thread t1 = new Thread(() -> {
            System.out.println("Это поток - " + Thread.currentThread().getName());
            int time = random.nextInt(3000);
            System.out.println("Время засыпания - " + time);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Это поток - " + Thread.currentThread().getName());
            int time = random.nextInt(3000);
            System.out.println("Время засыпания - " + time);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t3 = new Thread(() -> {
            System.out.println("Это поток - " + Thread.currentThread().getName());
            int time = random.nextInt(3000);
            System.out.println("Время засыпания - " + time);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t4 = new Thread(() -> {
            System.out.println("Это поток - " + Thread.currentThread().getName());
            int time = random.nextInt(3000);
            System.out.println("Время засыпания - " + time);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t5 = new Thread(() -> {
            System.out.println("Это поток - " + Thread.currentThread().getName());
            int time = random.nextInt(3000);
            System.out.println("Время засыпания - " + time);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        t5.start();
        t5.join();



    }
}
