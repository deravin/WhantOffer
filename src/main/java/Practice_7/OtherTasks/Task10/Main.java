package Practice_7.OtherTasks.Task10;

public class Main {
    public static void main(String[] args) {
        TelephoneBook telephoneBook = new TelephoneBook();
        telephoneBook.addNumber("Ann", "980980");
        telephoneBook.addNumber("Nina", "5665");
        telephoneBook.addNumber("Ann", "452345");
        telephoneBook.addNumber("Jane", "0909-023");
        telephoneBook.addNumber("Bob", "88849-32");

        telephoneBook.printBook();

        telephoneBook.findNumberByName("Jane");
        telephoneBook.findNumberByName("ghg");
    }
}
