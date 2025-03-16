package Practice_10_MultiThreads.Task6_WorkDuring5Seconds;
// 6. Использование Thread.sleep()
// Создайте поток, который выполняет работу в течение 5 секунд,
// каждую секунду выводя сообщение "Работаю...". После завершения выведите "Поток завершён".
public class ThreadWorker implements Runnable{
    long startTime = System.currentTimeMillis();

    @Override
    public void run() {
        while (System.currentTimeMillis() - startTime < 5000) {
            System.out.println("Работаю...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Ошибка из потока");
                ;
            }
        }
    }
}
