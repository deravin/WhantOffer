package TasksFromInterview.SortingWithComporator;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Гарри Поттер", 500);
        Book b2 = new Book("Властелин колец", 1000);
        Book b3 = new Book("Маленький принц", 150);

        List<Book> booksLibrary = new ArrayList<>();
        booksLibrary.add(b1);
        booksLibrary.add(b2);
        booksLibrary.add(b3);

        Collections.sort(booksLibrary);
        System.out.println(booksLibrary);

    }
}
