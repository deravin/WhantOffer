package Practice_10_MultiThreads.Task6_WorkDuring5Seconds;

public class Main {
    public static void main(String[] args) {
        ThreadWorker worker = new ThreadWorker();
        Thread t1 = new Thread(worker);
        t1.start();
    }
}
