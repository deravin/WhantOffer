package Practice_2.Task10;

public class Laptop {
    String brand;
    double price;

    Laptop(String l, double p){
        this.brand = l;
        this.price = p;
    }
    String getBrand(){
        return brand;
    }
    double getPrice(){
        return price;
    }
    void setPrice(double p){
        this.price = p;
    }
    void setBrand(String b){
        this.brand = b;
    }
    void printInfo(){
        System.out.println("Ноутбук: " + brand + ", Цена: " + price + " руб.");
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Lenovo", 7000.0);
        laptop1.setPrice(76000.56);
        laptop1.printInfo();
    }
}
