package Practice_6.Task_3_Restoran;

public class MainDishes extends Dish{
    private float temperature;

    public MainDishes(String name, double price, float temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public float getTemperature() {
        return temperature;
    }

    @Override
    public void showInfo() {
        System.out.println("Температура блюда - " + temperature);
    }
}
