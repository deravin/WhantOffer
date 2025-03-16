package Practice_4.TaskFromVideo.Solvers;

public class IfElseTaskSolver {

        public static String checkParity(int x) {
            return  (x % 2 == 0)? "четное":"нечетное";
        }

        public static String checkAge(int age){
            String desc = "несовершеннолетний";
            if (age >= 18 && age <= 60) {
                desc = "взрослый";
            } else if (age >= 60) {
                desc = "пожилой";
            }
            return desc;
        }

        public static int checkMax(int a, int b, int c){
            return Math.max(Math.max(a,b),c);
        }


    }

