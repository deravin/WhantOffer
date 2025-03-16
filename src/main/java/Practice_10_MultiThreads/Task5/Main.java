package Practice_10_MultiThreads.Task5;

public class Main {
    // Создайте поток, который выполняет бесконечный цикл.
    // После запуска основного потока через 3 секунды вызовите interrupt() и убедитесь,
    // что поток корректно завершает свою работу.
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Поток выполняется");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        Thread.sleep(3000);
        t1.interrupt();
    }
}
