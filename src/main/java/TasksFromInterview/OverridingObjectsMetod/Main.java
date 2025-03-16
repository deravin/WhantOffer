package TasksFromInterview.OverridingObjectsMetod;

public class Main {
    public static void main(String[] args) {
        // Если строка создаётся через литерал (без new),
        // то при повторном присвоении того же значения новый объект не создаётся,
        // а переменная просто ссылается на уже существующую строку в пуле.

        String name1 = "Анастасия";
        String name2 = "Анастасия";

        System.out.println(name1.equals(name2)); // true (Обе переменные указывают на один и тот же объект)

        // по умолчанию equals() сравнивает ссылки
        // но у класса String он переопределён так, чтобы сравнивать содержимое строки, а не ссылки.

        String str1 = new String("Анастасия");
        String str2 = new String("Анастасия");

        System.out.println(str1.equals(str2)); // true (тк сравниваем содержимое, а оно одинаковое)

        // Для объектов созданных вручную классов, equals сравнивает ссылки,
        // если его не переопределить, то одинаковые значения будут не равны.

        Person person1 = new Person("Анастасия", 33);
        Person person2 = new Person("Анастасия", 33);

        System.out.println(person1.equals(person2)); // false (тк сравнение идет по ссылке, а они разные)

        // У класса PersonWithOverriding метод equals переопределен и тогда сравнение верное

        PersonWithOverriding p1 = new PersonWithOverriding("Anastasia", 33);
        PersonWithOverriding p2 = new PersonWithOverriding("Anastasia", 33);

        System.out.println(p1.equals(p2));

    }
}
