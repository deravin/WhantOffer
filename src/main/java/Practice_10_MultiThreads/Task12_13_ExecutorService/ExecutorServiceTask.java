package Practice_10_MultiThreads.Task12_13_ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTask {
    // 12. Использование ExecutorService
    //Создайте ExecutorService с фиксированным пулом из 3 потоков.
    // Запустите 10 задач, каждая из которых выводит "Задача выполнена" и засыпает на 2 секунды.

    // 13. Ожидание завершения всех задач
    // Используйте shutdown() и awaitTermination() для ожидания завершения всех задач перед выходом из программы.
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 10 ; i++){
            int taskId = i;
            executorService.execute(() -> {
                System.out.println("Задача "+ taskId + " выполнена");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(2, TimeUnit.SECONDS);
    }

}
