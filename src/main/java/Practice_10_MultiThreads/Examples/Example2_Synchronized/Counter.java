package Practice_10_MultiThreads.Examples.Example2_Synchronized;

public class Counter {
    // методы по увеличению и уменьшению значения
    // реализовать решение в многопоточной среде

    private int count = 0;

    public synchronized void increment(){
        this.count++;
    }
    public synchronized void decrement(){
        this.count--;
    }
    public synchronized int getCount(){
        return this.count;
    }
}
