package Practice_6.Task_3_Restoran;

public class Main {
    public static void main(String[] args) {
        Dish spagetti = new MainDishes("Спагетти", 750, 50);
        Dish tea = new Drinks("Чай", 300 ,80);

        Menu menu = new Menu();
        menu.showInfo(spagetti);
        menu.showInfo(tea);
    }
}
