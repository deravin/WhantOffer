package Practice_6.Task_5_1;

public class Readers implements Library_1{
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public void takeBook(String bookName) {
        System.out.println("Читатель " + this.name + " взял книгу " + bookName);
    }

    @Override
    public void returnBook(String bookName) {
        System.out.println("Читатель " + this.name + " вернул книгу" + bookName);
    }
}
