package Practice_10_MultiThreads.Task2;

public class NewRunnable implements Runnable{
    //Создайте класс, реализующий Runnable, и передайте его в Thread. В методе run() выведите "Runnable работает".
    @Override
    public void run() {
        System.out.println("Runnable работает");
    }
}
