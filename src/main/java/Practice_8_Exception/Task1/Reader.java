package Practice_8_Exception.Task1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void readFile(String filePath){
    try (FileReader fileReader = new FileReader(filePath)){
        while ((fileReader.read()) != -1){
            System.out.print((char) fileReader.read());
        }
    } catch (FileNotFoundException e){
        System.out.println("Файл " + filePath + " не найден" );
    } catch (IOException e){
        System.out.println("Ошибка при чтении файла" + e.getMessage());
    }
}

    public static void main(String[] args) {
        Reader.readFile("/Users/anastasialukyanova/Desktop/Test");
    }
}
