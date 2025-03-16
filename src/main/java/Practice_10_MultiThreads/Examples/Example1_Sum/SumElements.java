package Practice_10_MultiThreads.Examples.Example1_Sum;

public class SumElements {
    // посчитать сумму эл-ов большого массива
    // с помощью разделеления на 2 части и исп-ия нескольких потоков
    // первый массив - 0 до array.length/2
    // второй массив - array.length/2 + 1 до array.length

    private static final int[] array = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) throws InterruptedException {
        int sum = parallelSum(array);
        System.out.println(sum);
    }

    public static int parallelSum(int[] array) throws InterruptedException {
        int halfSize = array.length / 2;
        ThreadSum firstHalf = new ThreadSum(array, 0, halfSize);
        ThreadSum secondHalf = new ThreadSum(array, halfSize, array.length);

        Thread t1 = new Thread(firstHalf);
        Thread t2 = new Thread(secondHalf);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        return firstHalf.getSum() + secondHalf.getSum();
    }
}
