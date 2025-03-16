package Practice_10_MultiThreads.Task4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Создайте два потока, которые выводят сообщения в консоль. В основном потоке используйте join(),
        // чтобы основной поток ждал завершения обоих потоков перед тем, как завершить выполнение.
        Thread t1 = new Thread(() ->
                System.out.println("Сообщение от потока " + Thread.currentThread().getName())
                );
        Thread t2 = new Thread(() ->
                System.out.println("Сообщение от потока " + Thread.currentThread().getName()));

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
