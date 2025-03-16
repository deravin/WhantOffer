package Practice_8__Generics.Task7;

public class Main {
    public static void main(String[] args) {
        MapWithUnknownTypes<Integer, String> map = new MapWithUnknownTypes<>();
        map.addElement(1, "Первый");
        map.addElement(2, "Второй");
        map.addElement(3, "Третий");

        map.printMap();
    }
}
