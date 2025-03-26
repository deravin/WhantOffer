package ComplexTasks.Task1_Manager;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EntityManager <T> {
    /**
     * Разработайте класс EntityManager<T>, который будет управлять коллекцией объектов произвольного типа T,
     * обеспечивая потокобезопасное добавление, удаление и получение элементов.
     * Класс также должен предоставлять специфические методы фильтрации данных,
     * которые позволяют пользователю извлекать элементы по определённым критериям.
     *
     * Функциональные требования:
     * Добавление элементов: Метод для добавления объекта в коллекцию. Должен быть потокобезопасным.
     * Удаление элементов: Метод для удаления объекта из коллекции. Возвращает true, если объект был удалён,
     * и false, если объект не найден в коллекции. Должен быть потокобезопасным.
     * Получение всех элементов: Метод возвращает копию списка всех элементов,
     * обеспечивая невозможность изменения исходной коллекции через возвращаемый список.
     *
     * Специализированные методы фильтрации:
     * Фильтрация по возрасту: Возвращает список пользователей в заданном возрастном диапазоне.
     * Фильтрация по имени: Возвращает список пользователей, чьи имена соответствуют заданной строке.
     * Фильтрация по активности: Возвращает список пользователей с заданным статусом активности.
     */

    public final HashSet<T> set = new HashSet<>();

    // потокобезопасное добавление
    public synchronized void addElement(T e){
        set.add(e);
    }

    // потокобезопасное удаление элементов
    public synchronized boolean removeElement(T e){
        if (set.contains(e)){
            return set.remove(e);
        } else {
            return false;
        }
    }

    // Получение всех элементов
    public synchronized Set<T> getAllElements(){
        return Set.copyOf(set);
    }

    // фильтрации данных
    public synchronized Set<T> filteredBy (Predicate<T> predicate){
        return set.stream().filter(predicate).collect(Collectors.toSet());
    }

}
