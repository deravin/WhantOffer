package Practice_10_MultiThreads.Task23_1;

public class Order implements Runnable {
    private int orderId;

    public Order(int orderId){
        this.orderId = orderId;
    }

    public int getOrderId(){
        return this.orderId;
    }

    @Override
    public void run() {
        System.out.println("Заказ " + getOrderId() + " обрабатывается...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString(){
        return "" + orderId;
    }
}
