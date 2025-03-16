package Practice_2_1.Task_10;

public class Laptop {
    private String brand;
    private double price;
    public Laptop(String brand, double price){
        this.brand = brand;
        this.price = price;
    }
    public String getBrand(){
        return brand;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void printInfo(){
        System.out.println("Ноутбук: " + brand + ", Цена: " + price + " руб.");
    }

    public static void main(String[] args) {
        Laptop lenovo = new Laptop("Lenovo", 1000);
        lenovo.setPrice(23000);
        lenovo.printInfo();
    }

}
