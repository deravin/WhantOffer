package Practice_7.Example.restaurant_manager;

public class Main {
    public static void main(String[] args) {
        RestaurantManager manager = new RestaurantManager();
        manager.addOrder("Free");
        manager.addOrder("Milk shake");
        manager.addOrder("Banana");
        manager.addOrder("Pizza");
        manager.printOrders();

        manager.getNextOrder();
        manager.printOrders();
        manager.deleteOrder("Banana");
        manager.printOrders();

    }
}
