package Practice_8_Exception.Example.Library;

import Practice_8_Exception.Example.Library.Exceptions.BookNotFoundException;
import Practice_8_Exception.Example.Library.Exceptions.InvalidBookException;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Library {
    public List<Book> books;

    public void addBook(Book book) throws InvalidBookException {
        if (books.contains(book)) {
            throw new InvalidBookException("Такая книга уже существует в библиотеке");
        } else {
            books.add(book);
        }
    }

    public Book findBook (String name) throws BookNotFoundException {
        AtomicReference<Book> foundBook = new AtomicReference<>();
        books.forEach(book -> {
            if (book.getName() == name){
                foundBook.set(book);
            }
        });
        if (foundBook.get() == null){
            throw new BookNotFoundException("Не нашли книгу по имени " + name);
        }
        return foundBook.get();
    }
}
