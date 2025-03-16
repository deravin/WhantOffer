package Practice_10_MultiThreads.Task15_16_Collable_InvokeAll;

import java.util.concurrent.*;

public class Main {
    // 15. Получение результата из потока
    // Создайте Callable, который вычисляет сумму чисел от 1 до 100 и возвращает результат. Используйте Future для получения результата.
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<Integer> sum = () -> {
          int result = 0;
            for (int i = 1; i<=100; i++){
              result += i;
            }
            return result;
        };
        Future<Integer> future = executorService.submit(sum);
        System.out.println("Result " + future.get());
        executorService.shutdown();
    }
}
