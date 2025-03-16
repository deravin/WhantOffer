package Practice_8_Exception.Example.Library.Exceptions;

public class InvalidBookException extends RuntimeException{
      public InvalidBookException(String message){
          super(message);
      }
}
