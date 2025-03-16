package Practice_7.Example.PhoneBook;

import java.util.HashMap;

public class ContactBook {
    private HashMap<String, Integer> contacts;

    public ContactBook(){
        this.contacts = new HashMap<>();
    }

    // ключ - значение (имя телефон)
    public void addContact(String name, int phone){
        contacts.put(name, phone);
    }

    // поиск контакта по имени
    public int getPhone(String name){
        return contacts.get(name);
    }

    // обновление телефона по имени
    public void updatePhone(String name, int newPhone){
        contacts.put(name, newPhone);
    }

    public void printContacts(){
        System.out.println("все контакты: ");
        contacts.forEach(
                (name, phone) -> System.out.println("имя "+name+ ", телефон "+phone)
        );
        System.out.println();
    }
}
