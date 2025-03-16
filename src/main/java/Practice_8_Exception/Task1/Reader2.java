package Practice_8_Exception.Task1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader2 {
    //Обработка файла: Напишите метод, который читает файл и обрабатывает FileNotFoundException и IOException.
    public static void readFile(String filePath){
        try {
            FileReader fileReader = new FileReader(filePath);
            int simbol;
            while ((simbol = fileReader.read()) != -1){
                System.out.print((char) simbol);
            }
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        } catch (IOException e){
            System.out.println("Ошибка при чтении файла");
        }
    }

    public static void main(String[] args) {
        readFile("/Users/anastasialukyanova/Desktop/Tes");
    }
}
