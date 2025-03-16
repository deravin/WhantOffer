package Practice_6.Task_5_Library;

public class Main {
    public static void main(String[] args) {
        Library book1 = new Books("А.С.Пушкин", "Руслан и Людмила");
        Library reader1 = new Readers("Ann");

        Archive archive = new Archive();

        archive.fixData(book1);
        archive.fixData(reader1);
    }
}
