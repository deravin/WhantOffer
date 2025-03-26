package ComplexTasks.Task1_Manager;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alice", Activity.ACTIVE, 25);
        User user2 = new User("Jhon", Activity.ACTIVE, 20);
        User user3 = new User("Nina", Activity.DELETED, 34);
        User user4 = new User("Bob", Activity.ACTIVE, 23);
        User user5 = new User("Georg", Activity.DELETED, 34);

        EntityManager<User> usersList = new EntityManager<>();
        usersList.addElement(user1);
        usersList.addElement(user2);
        usersList.addElement(user3);
        usersList.addElement(user4);
        usersList.addElement(user5);

        // получение списка элементов
        System.out.println(usersList.getAllElements());

        // Фильтрация по возрасту
       Set<User> userListFilteredByAge = usersList.filteredBy(user -> user.getAge() >= 20 && user.getAge() <= 30);
        System.out.println("Пользователи от 20 до 30 лет - " + userListFilteredByAge);
        // фильтрация по имени
        Set<User> userListFilteredByName = usersList.filteredBy(user -> user.getUsername().equals("Nina"));
        System.out.println("Пользователи с именем Nina - " + userListFilteredByAge);
        // Фильтрация по активности
        Set<User> userListFilteredByaActivity = usersList.filteredBy(user -> user.getActivity().equals("ACTIVE"));
        System.out.println("Пользователи со статусом ACTIVE - " + userListFilteredByAge);

        // удаление элемента
        usersList.removeElement(user5);

        System.out.println(usersList.getAllElements());
}
}
