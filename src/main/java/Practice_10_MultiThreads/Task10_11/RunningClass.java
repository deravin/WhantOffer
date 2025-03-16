package Practice_10_MultiThreads.Task10_11;

public class RunningClass {
    // 10. Проблема видимости переменной между потоками
    //Создайте класс с булевой переменной running, по умолчанию true.
    // В одном потоке выполняйте while (running), а в другом потоке через 3 секунды измените running = false. Проверьте, завершится ли первый поток.

    // 11. Исправление проблемы с volatile
    //Добавьте volatile к running и убедитесь, что поток корректно завершает работу после изменения переменной.

    private static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            while (running){
                System.out.println("Running is true ...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            running = false;
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

}
