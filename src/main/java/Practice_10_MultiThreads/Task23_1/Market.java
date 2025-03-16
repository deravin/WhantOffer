package Practice_10_MultiThreads.Task23_1;

import java.util.concurrent.*;

public class Market {
    ////23. Многопоточная обработка заказов в интернет-магазине
    //    //Разработайте систему, в которой покупатели (Thread) делают заказы, а обработчики (ExecutorService) выполняют их.
    //    //Используйте BlockingQueue для хранения заказов.
    //    //Покупатели добавляют заказы в очередь.
    //    //Обработчики берут заказы из очереди и обрабатывают их.
    //    //Когда все заказы обработаны, программа завершает работу.
    public static void main(String[] args) throws InterruptedException {
        ExecutorService ordersExecutor = Executors.newSingleThreadExecutor();
        BlockingQueue<Order> orders = new LinkedBlockingQueue<>();

        Thread customer1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++){
                Order order = new Order(i);
                orders.add(order);
                System.out.println("Пользователь 1 добавил заказ " + order + " в очередь");
            }
        });
        Thread customer2 = new Thread(() -> {
            for (int i = 1; i <= 7; i++){
                Order order = new Order(i);
                orders.add(order);
                System.out.println("Пользователь 2 добавил заказ " + order + " в очередь");
            }
        });
        Thread customer3 = new Thread(() -> {
            for (int i = 1; i <= 4; i++){
                Order order = new Order(i);
                orders.add(order);
                System.out.println("Пользователь 3 добавил заказ " + order + " в очередь");
            }
        });

        customer1.start();
        customer2.start();
        customer3.start();

        customer1.join();
        customer2.join();
        customer3.join();


        while (!orders.isEmpty()) {
            Order orderForExecutor = orders.poll();
            if (orderForExecutor != null) {
                ordersExecutor.execute(orderForExecutor);
            }
        }

        ordersExecutor.shutdown();
        ordersExecutor.awaitTermination(30, TimeUnit.SECONDS);
        System.out.println("Все заказы обработаны успешно");
    }
}
