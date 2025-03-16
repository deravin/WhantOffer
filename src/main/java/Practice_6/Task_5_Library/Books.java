package Practice_6.Task_5_Library;

import Practice_2_1.Task_3.Book;

public class Books extends Library{
    private String author;
    private String title;
    private static int bookCount; // общее количество книг в библиотеке

    public Books(String author, String title){
    this.title=title;
    this.author=author;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public void takeBook() {
        System.out.println(author + " , " + title + " взяли из библиотеки");
        bookCount--;
    }

    @Override
    public void returnBook() {
        System.out.println(author + " , " + title + " вернули в библиотеку");
        bookCount++;
    }
}
