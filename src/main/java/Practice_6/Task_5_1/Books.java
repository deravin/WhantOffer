package Practice_6.Task_5_1;
import java.util.ArrayList;

public class Books extends Readers implements Library_1{
    public static ArrayList<String> listOfBooks;
    private String bookName;

    public void addBooks(String bookName){
        this.bookName = bookName;
        listOfBooks.add(bookName);
    }

    public void takeBook(String bookName){
        System.out.println(this.getName() + " взял из библиотеки книгу " + this.bookName);
        listOfBooks.remove(bookName);
        System.out.println("Осталось книг в библиотеке: " + listOfBooks.size());
    }

    public void returnBook(String bookName){
        System.out.println(this.getName() + " вернул книгу "+ this.bookName +" в библиотеку");
        listOfBooks.add(bookName);
        System.out.println("Осталось книг в библиотеке: " + listOfBooks.size());
    }
}
