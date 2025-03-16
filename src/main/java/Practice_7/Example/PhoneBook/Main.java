package Practice_7.Example.PhoneBook;

public class Main {
    public static void main(String[] args) {
        ContactBook contacts = new ContactBook();
        contacts.addContact("Anna", 676767);
        contacts.addContact("Bob", 43434);
        contacts.addContact("Alice", 11111);

        contacts.printContacts();
        System.out.println(contacts.getPhone("Bob"));

        contacts.updatePhone("Anna", 22222);
        contacts.printContacts();
    }
}
