package Practice_7.OtherTasks.Task12;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите последовательность скобок ");
        String input = scanner.nextLine();

        if (BracketsList.isBracketsListCorrect(input))
            System.out.println("последовательность верная");
        else System.out.println("последовательно не верная");


    }
}
