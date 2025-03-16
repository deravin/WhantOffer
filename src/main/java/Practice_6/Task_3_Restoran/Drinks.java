package Practice_6.Task_3_Restoran;

public class Drinks extends Dish{
    private float volume;

    public Drinks(String name, double price, float volume) {
        super(name, price);
        this.volume = volume;
    }

    public float getVolume() {
        return volume;
    }

    @Override
    public void showInfo() {
        System.out.println("Объем напитка - "+ volume);
    }
}
