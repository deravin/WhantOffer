package Practice_8_Exception.Example.Library.Exceptions;

public class BookNotFoundException extends Exception {
    public BookNotFoundException(String message){
        super(message);
    }
}
