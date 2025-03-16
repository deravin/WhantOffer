package Practice_10_MultiThreads.Task15_16_Collable_InvokeAll;

import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class CollableTask {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // 16. Запуск нескольких Callable
        //Создайте 5 задач Callable, каждая из которых возвращает случайное число. Соберите все результаты с помощью ExecutorService.
        //Запустите 5 Callable задач и получите их результаты с помощью invokeAll().
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Random random = new Random();
        List<Callable<Integer>> tasks = List.of(
                () -> {
                    int number1 = random.nextInt();
                    return number1;
                },
                () -> {
                    int number2 = random.nextInt();
                    return number2;
                },
                () -> {
                    int number3 = random.nextInt();
                    return number3;
                },
                () -> {
                    int number4 = random.nextInt();
                    return number4;
                },
                () -> {
                    int number5 = random.nextInt();
                    return number5;
                }
        );
        List <Future<Integer>> futures = executorService.invokeAll(tasks);
        for (Future<Integer> future : futures){
            System.out.println(future.get());
        }
        executorService.shutdown();
    }
}
