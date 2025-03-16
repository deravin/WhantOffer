package Practice_3.Task6_Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("123-445-55","Anna", "Lowrens");
        Person person2 = new Person("123-344-11","Bob", "Martin");

        person2.printPersonInfo();
        person2.setFirstName("Robby");
        person2.setLastName("Williams");
        person2.printPersonInfo();
        person1.printPersonInfo();
    }
}
