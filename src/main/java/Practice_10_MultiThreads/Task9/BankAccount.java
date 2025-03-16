package Practice_10_MultiThreads.Task9;

public class BankAccount {
    // 9. Несколько потоков с synchronized
    //Создайте класс BankAccount с методом withdraw(), уменьшающим баланс.
    // Запустите два потока, которые пытаются снять деньги одновременно, и используйте synchronized, чтобы избежать некорректных операций.

    private static double balance = 100;

    public static synchronized void withdraw(double value) {
        System.out.println(balance -= value);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            while (balance > 0) {
                withdraw(10);
            }
        });
        Thread t2 = new Thread(() -> {
            while (balance > 0) {
                withdraw(20);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
