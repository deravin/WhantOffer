package Practice_10_MultiThreads.Task14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServicePools {
    // 14. Разные типы пулов потоков
    //Создайте три ExecutorService:
    //newFixedThreadPool(3)
    //newCachedThreadPool()
    //newSingleThreadExecutor()
    //Запустите 5 задач в каждом из них и сравните поведение.
    public static void main(String[] args) {
        ExecutorService executorService1 = Executors.newFixedThreadPool(3);
        ExecutorService executorService2 = Executors.newCachedThreadPool();
        ExecutorService executorService3 = Executors.newSingleThreadExecutor();

        for (int i = 1; i <= 5; i++) {
            executorService1.execute(() -> {
                System.out.println("Выполняются задачи из ExecutorService1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
          for (int i = 1; i <= 5; i++){
            executorService2.execute(()->{
                System.out.println("Выполняются задачи из ExecutorService2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        for (int i = 1; i <= 5; i++){
            executorService3.execute(()->{
                System.out.println("Выполняются задачи из ExecutorService3");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

    }
}
