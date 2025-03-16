package Practice_2_1.Task_9;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice (double price){
        this.price = price;
    }
    public double applyDiscount(double discount){
        return price = price - price/100*discount;
    }
    public void printInfo(){
        System.out.println("Товар: "+ name + ", Цена: "+ price + " руб.");
    }

    public static void main(String[] args) {
        Product product1 = new Product("Apple", 15.6);
        product1.setPrice(10.5);
        product1.applyDiscount(10);
        product1.printInfo();
    }

}
