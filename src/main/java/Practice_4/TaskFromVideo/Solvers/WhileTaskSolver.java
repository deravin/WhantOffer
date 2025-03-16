package Practice_4.TaskFromVideo.Solvers;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void count (){
        int i = 0;
        while (i < 10){
            i++;
            System.out.println(i);
        }
    }

    public static void commandReader(){
        Scanner scanner = new Scanner(System.in);

        String command = "";

        while (!command.equals("exit")){
            System.out.print("введите команду");
            command = scanner.nextLine();
        }
        System.out.println("программа завершена");
    }

    public static int sumFromUser(int x){
        int sum = 0;
        while (x > 0){
            sum = sum + x % 10;
            x = x/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // count();
        // commandReader();
        System.out.println(sumFromUser(1004));
    }

}
