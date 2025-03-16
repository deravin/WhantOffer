package Lection8;

public class Main {
    public static void main(String[] args) {
        Person nikita = new Person("Nikita", 19);

        System.out.println(nikita.toString());

        // сравнение двух персон
        Person nikita2 = new Person("Nikita", 19);
        System.out.println(nikita.equals(nikita2));

        //клонирование
        Person cloneNikita = nikita.clone();
        System.out.println(cloneNikita);

        Cat luna = new Cat("Luna", 2);
        Cat marsik = new Cat("Marsik", 4);

        System.out.println(luna.toString());
        luna.equals(marsik);
        luna.hashCode();


    }
}
