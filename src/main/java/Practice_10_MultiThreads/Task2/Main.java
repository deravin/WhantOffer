package Practice_10_MultiThreads.Task2;

public class Main {
    public static void main(String[] args) {
        NewRunnable runnable = new NewRunnable();
        Thread t1 = new Thread(runnable);
        t1.start();
    }
}
