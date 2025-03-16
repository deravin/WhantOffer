package Practice_8__Generics.Task6;
// Обобщённый интерфейс: Создайте интерфейс Container<T>, содержащий методы add(T item) и get().

public interface Container <T> {
    void add(T item);
    T get();
}
