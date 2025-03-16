package TasksFromInterview.SortingWithComporator;

public class Book implements Comparable<Book>{
    private String title;
    private int pages;
    public Book(String title, int pages){
        this.pages = pages;
        this.title = title;
    }
    public int getPages(){
        return this.pages;
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.pages, other.pages);
    }
    @Override
    public String toString(){
        return "Title - " + title + ", pages - " + pages;
    }
}
