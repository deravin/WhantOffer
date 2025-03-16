package Practice_2.Task9_Product;

public class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return name;
    }
    double getPrice() {
        return price;
    }
    void setName(String name){
        this.name = name;
    }
    void setPrice(double price){
        this.price = price;
    }
    double applyDiscount(double discount){
        return price -= price/100*discount;
    }
    void printInfo(){
        System.out.println("Товар: " + name + ", Цена: " + price + " руб");
    }

    public static void main(String[] args) {
        Product product1 = new Product("Хлеб", 105);
        product1.setPrice(100);
        product1.applyDiscount(20);
        product1.printInfo();
    }
}
