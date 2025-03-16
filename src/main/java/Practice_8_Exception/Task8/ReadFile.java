package Practice_8_Exception.Task8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    //Обязательное закрытие ресурсов: Напишите метод, который открывает файл и читает данные,
    // используя try-with-resources, чтобы гарантированно закрывать ресурс.
    public static void reader(String path){
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
          String line;
          while ((line = br.readLine()) != null){
              System.out.println(line);
          }
        } catch (IOException e){
            System.out.println("Ошибка чтения файла " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        reader("/Users/anastasialukyanova/Desktop");
    }
}
