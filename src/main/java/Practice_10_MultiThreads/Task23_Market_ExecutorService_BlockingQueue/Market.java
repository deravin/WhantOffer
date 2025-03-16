package Practice_10_MultiThreads.Task23_Market_ExecutorService_BlockingQueue;

import java.util.Collections;
import java.util.concurrent.*;

public class Market {
    //23. Многопоточная обработка заказов в интернет-магазине
    //Разработайте систему, в которой покупатели (Thread) делают заказы, а обработчики (ExecutorService) выполняют их.
    //Используйте BlockingQueue для хранения заказов.
    //Покупатели добавляют заказы в очередь.
    //Обработчики берут заказы из очереди и обрабатывают их.
    //Когда все заказы обработаны, программа завершает работу.
    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<Order> orders = new LinkedBlockingDeque<>();
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 9; i++) {
                orders.add(new Order(i));
                System.out.println("Пользователь 1, сделал заказ " + i);
            }
            });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 9; i++) {
                orders.add(new Order(i));
                System.out.println("Пользователь 1, сделал заказ " + i);
            }
        });
        Thread t3 = new Thread(() ->{
            for (int i = 0; i <= 9; i++) {
                orders.add(new Order(i));
                System.out.println("Пользователь 1, сделал заказ " + i);
            }
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        while (!orders.isEmpty()) {
            Order order = orders.poll();
            if (order != null) {
                executorService.execute(order);
            }
        }

        executorService.shutdown();
        executorService.awaitTermination(100, TimeUnit.SECONDS);
        System.out.println("All orders processed. System shutting down.");
    }
}
