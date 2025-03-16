package Practice_10_MultiThreads.Task23_Market_ExecutorService_BlockingQueue;

public class Order implements Runnable{
    private int id;

    public Order(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Обработка заказа " + id);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("заказ обработан " + id);
    }
    @Override
    public String toString(){
        return "order - " + id;
    }
}
