package Practice_8_Exception.Task9;

import java.util.Scanner;

public class SetNumber {
    //Запрос ввода у пользователя: Реализуйте метод, который запрашивает у пользователя число,
    // но не принимает null или пустую строку, выбрасывая IllegalArgumentException.
    public static void setNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число - ");
        String number = scanner.nextLine();
        if (number == null || number.trim().isEmpty()){
            throw new IllegalArgumentException(" Введены некорректные данные!");
        }
        try {
            int ParseNumber;
            ParseNumber = Integer.parseInt(number);
        } catch (IllegalArgumentException e){
            System.out.println(" Это не число!");
        }

    }

    public static void main(String[] args) {
        try {
            setNumber();
        } catch (IllegalArgumentException e){
            System.out.println("Ошибка - " + e.getMessage());
        }
    }
}
