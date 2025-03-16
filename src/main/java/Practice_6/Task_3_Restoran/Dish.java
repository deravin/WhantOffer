package Practice_6.Task_3_Restoran;

public abstract class Dish {
    private String name;
    private double price;

    public Dish (String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public abstract void showInfo();

    public void printDishInfo(){
        System.out.println("Блюдо: " + name + " Цена: " + price);
    }
}
