package Practice_2.Task3_Book;

public class Book {
    String title;
    String author;

    Book(String title, String author){
        this.title=title;
        this.author=author;
    }
    String getTitle(){
        return title;
    }
    String getAuthor(){
        return author;
    }
    void setTitle(String title){
        this.title=title;
    }
    void setAuthor(String author){
        this.author=author;
    }
    void printInfo(){
        System.out.println("Название: " + title + ", Автор: " + author);
    }
}
