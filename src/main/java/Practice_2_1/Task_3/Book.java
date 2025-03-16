package Practice_2_1.Task_3;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author){
        this.author = author;
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void printInfo(){
        System.out.println("Название: " + title + ", Автор: " + author);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Гарри Поттер", "Test");
        book1.setAuthor("Джоан Роулинг");
        book1.printInfo();
    }

}
