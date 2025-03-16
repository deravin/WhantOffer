package Practice_3_1.Task_6;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Anna", "Luis", "12321312");
        Person person2 = new Person("Bob", "Luis", "7867846");
        Person person3 = new Person("Kate", "Winston", "08989");

        person1.setFirstName("Anastasia");
        person1.setLastName("Lu");

        person1.printPersonInfo();
        person2.printPersonInfo();
        person3.printPersonInfo();
    }
}
