package Practice_10_MultiThreads.Task22_FileLoader_ExecutorService;

import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FileLoader {
    //22. Разработка многопоточной системы загрузки файлов
    //Создайте систему, которая загружает несколько файлов параллельно.
    //Используйте ExecutorService с FixedThreadPool.
    //Каждый поток должен скачивать один файл (имитация загрузки через Thread.sleep()).
    //После завершения всех загрузок выведите сообщение "Все файлы загружены".

    public static final URL firstFileUrl = FileLoader.class.getClassLoader().getResource("1.txt");
    public static final URL secondFileUrl = FileLoader.class.getClassLoader().getResource("2.txt");
    public static final URL thirdFileUrl = FileLoader.class.getClassLoader().getResource("3.txt");

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(() -> {
            System.out.println("Загружаю файл - " + firstFileUrl.getPath());
            firstFileUrl.getFile();
            try {
                Thread.sleep(2000);
                System.out.println("Файл загружен");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        executorService.execute(() -> {
            System.out.println("Загружаю файл - " + secondFileUrl.getPath());
            secondFileUrl.getFile();
            try {
                Thread.sleep(2000);
                System.out.println("Файл загружен");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        executorService.execute(() -> {
            System.out.println("Загружаю файл - " + thirdFileUrl.getPath());
            thirdFileUrl.getFile();
            try {
                Thread.sleep(2000);
                System.out.println("Файл загружен");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executorService.shutdown();
        if (executorService.awaitTermination(5, TimeUnit.SECONDS)){
            System.out.println("Все файлы загружены");
            executorService.shutdownNow();
        }

    }
}
