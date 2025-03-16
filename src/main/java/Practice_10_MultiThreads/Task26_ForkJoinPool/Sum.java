package Practice_10_MultiThreads.Task26_ForkJoinPool;

import java.util.concurrent.RecursiveTask;

public class Sum extends RecursiveTask<Integer> {
    //Разработайте программу, которая суммирует элементы большого массива, используя ForkJoinPool.
    //Разделите массив на части.
    //Если длина части больше 10, рекурсивно разбейте её на подзадачи.
    //Если длина 10 или меньше, выполните суммирование.
    //Соберите и выведите финальную сумму.

    private int[] array;
    private int start;
    private int end;

    public Sum(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;
        if (end - start <= 10) {
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            return sum;
        }

        int mid = (start + end) / 2;
        Sum leftSide = new Sum(array, start, mid);
        Sum rightSide = new Sum(array, mid, end);

        leftSide.fork();
        int sumOfRirhtSide = rightSide.compute();
        int sumOfLeftSide = leftSide.join();

        return sumOfLeftSide + sumOfRirhtSide;

    }
}
