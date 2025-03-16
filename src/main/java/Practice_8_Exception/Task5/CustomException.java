package Practice_8_Exception.Task5;

public class CustomException extends RuntimeException{
    public CustomException(String message, Throwable cause){
        super(message,cause);
    }
}
