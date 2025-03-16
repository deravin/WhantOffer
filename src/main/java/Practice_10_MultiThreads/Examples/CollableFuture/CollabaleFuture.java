package Practice_10_MultiThreads.Examples.CollableFuture;

import java.util.Random;
import java.util.concurrent.*;

public class CollabaleFuture {
    // сложные рассчеты ДНК, задача дождаться вычисления и получить результат
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<Integer> dnaResult = () -> {
            System.out.println("сложное вычисление");
            Thread.sleep(5000);
            int randomResult = new Random().nextInt();
            return randomResult;
        };

        Future<Integer> future = executorService.submit(dnaResult);

        System.out.println("Результат - " + future.get());

        executorService.shutdown();
    }
}
