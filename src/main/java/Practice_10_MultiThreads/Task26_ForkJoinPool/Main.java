package Practice_10_MultiThreads.Task26_ForkJoinPool;

import java.util.concurrent.ForkJoinPool;

public class Main {
    //26. Параллельное вычисление суммы массива (ForkJoinPool)
    //Разработайте программу, которая суммирует элементы большого массива, используя ForkJoinPool.
    //Разделите массив на части.
    //Если длина части больше 10, рекурсивно разбейте её на подзадачи.
    //Если длина 10 или меньше, выполните суммирование.
    //Соберите и выведите финальную сумму.
    public static void main(String[] args) {
        int[] array = new int[1000];
        for (int i = 0; i < array.length ; i++) {
            array[i] = i+1;
        }

        ForkJoinPool pool = new ForkJoinPool();
        Sum task = new Sum(array,0,array.length);

        int result = pool.invoke(task);
        System.out.println(result);

    }

}
