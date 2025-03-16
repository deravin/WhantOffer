package Practice_8_Exception.Task5;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionChaining {
    //Цепочка исключений: Создайте метод, который выбрасывает одно исключение, но перехватывает его и выбрасывает другое (Exception Chaining).
    public static void reader(String filePath){
        try {
            FileReader fileReader = new FileReader(filePath);
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
            throw new CustomException("Случилась ошибка!", e);
        }
    }

    public static void main(String[] args) {
        try {
            reader("ghfghf");
        } catch (CustomException e){
            System.out.println("Это распечатано из мейн - " + e.getMessage());
        }
    }

}