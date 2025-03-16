package Practice_10_MultiThreads.Task24_DataUpdatingSystem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DataUpdating {
    //24. Автоматическая система обновления данных
    //Разработайте сервис, который раз в минуту обновляет данные в базе.
    //Используйте ScheduledExecutorService для автоматического запуска задачи обновления.
    //Каждый запуск должен выполняться в отдельном потоке.
    //Имитация работы с базой через Thread.sleep(2000).
    //Программа должна работать 5 минут, после чего завершаться.
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(Integer.MAX_VALUE);

        Runnable taskUpdating = () -> {
            System.out.println("Обновление данных в базе...  Поток " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        scheduledExecutorService.scheduleAtFixedRate(taskUpdating,0,3, TimeUnit.SECONDS);

        scheduledExecutorService.schedule(() -> {
            scheduledExecutorService.shutdown();
            System.out.println("Больше не обновляю базу");
        },15, TimeUnit.SECONDS);

        scheduledExecutorService.awaitTermination(20, TimeUnit.SECONDS);
        System.out.println("Работа с базой завершена");
    }
}
