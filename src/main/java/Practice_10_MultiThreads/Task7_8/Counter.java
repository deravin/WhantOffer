package Practice_10_MultiThreads.Task7_8;

public class Counter {
    //7. Проблема состояния гонки
    //Создайте класс Counter, который содержит переменную count и метод increment(),
    // увеличивающий её на 1. Запустите два потока, которые вызывают increment() 1000 раз. Проверьте, правильно ли обновляется count.

    // 8. Решение состояния гонки с synchronized
    //Модифицируйте предыдущий класс, добавив synchronized к increment(), чтобы избежать состояния гонки.

    private static int count = 0;

    public static synchronized void increment(){
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++){
                increment();
            }
            System.out.println("Из первого потока - " + count);
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000; i++){
                increment();
            }
            System.out.println("Из второго потока - " + count);
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + count);
    }

}
