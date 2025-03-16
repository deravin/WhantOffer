package Practice_6.Task_5_Library;

public class Readers extends Library{
    private String name;

    public Readers(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void takeBook() {
        System.out.println(name + " взял книгу");
    }

    @Override
    public void returnBook() {
        System.out.println(name + " вернул книгу");
    }
}
