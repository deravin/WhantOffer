package Practice_4.TaskFromVideo.Solvers;

public class ForTaskSolver {

    public static void multiplicationTable(int x){
        for (int i=1; i <= 10; i++){
            System.out.println(x + " * " + i + " = " + x*i);
        }
    }

    public static int sum(int n){
        int result = 0;
        for (int i = 1; i<=n; i++){
           result = result + i;
        }
        return result;
    }


    public static boolean checkNubmerIsSimple (int number){
        boolean isSimple = true;
        for (int i = 2; i <= number-1; i++){
            if (number % i == 0){
                isSimple = false;
                break;
            }
        }
        return isSimple;
    }

    public static void printAllSimpleNumbersBefore100(){
        for (int i = 2; i <= 100; i++){
            if(checkNubmerIsSimple(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printAllSimpleNumbersBefore100();
    }
}
