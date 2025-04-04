package Practice_10_MultiThreads.Examples.Example_5_DeadLock;

import java.io.File;

public class DeadLockFree {
    // работа с двумя файлами
    private static final File firtsFile = new File(DeadLockFree.class.getClassLoader().getResource("1.txt").getFile());
    private static final File secondFile = new File(DeadLockFree.class.getClassLoader().getResource("2.txt").getFile());

    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            synchronized (firtsFile){
                System.out.println("Поток 1 захватил файл 1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            synchronized (secondFile){
                System.out.println("Поток 1 захватил файл 2");
            }
        });

        Thread t2 = new Thread(() ->{
            synchronized (firtsFile){
                System.out.println("Поток 2 захватил файл 1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            synchronized (secondFile){
                System.out.println("Поток 2 захватил файл 2");
            }
        });

        t1.start();
        t2.start();
    }
}
