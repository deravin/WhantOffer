package ComplexTasks.Task5;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Fruits apple = new Fruits("apple", 100);
        Fruits orange = new Fruits("orange", 89.7);
        Fruits lime = new Fruits("lime", 68.3);

        Electronict smartphone = new Electronict("Nokia", 19999.9);
        Electronict heads = new Electronict("Heads", 3000);

        InventoryService.isInventoryOpen = true;

        InventoryService.addProduct(apple);
        InventoryService.addProduct(orange);
        InventoryService.addProduct(lime);

        InventoryService.addProduct(smartphone);
        InventoryService.addProduct(heads);

        Thread t1 = new Thread(
                () -> {
                    try {
                        System.out.println(InventoryService.getProductByCategory("electronics"));
                    } catch (OutOfStockException e){
                        System.out.println("Ошибка вывода списка товаров - " + e.getMessage());
                    }
                }
        );
        Thread t2 = new Thread(
                () -> {
                    try {
                        System.out.println(InventoryService.getProductByCategory("fruits"));
                    } catch (OutOfStockException e){
                        System.out.println("Ошибка вывода списка товаров - " + e.getMessage());
                    }
                }
        );

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(InventoryService.filterByPrice(100, 3500));

    }
}
