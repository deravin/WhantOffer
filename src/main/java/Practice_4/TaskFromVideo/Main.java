package Practice_4.TaskFromVideo;

import Practice_4.TaskFromVideo.Solvers.ForTaskSolver;
import Practice_4.TaskFromVideo.Solvers.IfElseTaskSolver;
import Practice_4.TaskFromVideo.Solvers.SwitchTaskSolver;

public class Main {
    public static void main(String[] args) {
        System.out.println(IfElseTaskSolver.checkParity(5));

        System.out.println(IfElseTaskSolver.checkAge(78));

        System.out.println(IfElseTaskSolver.checkMax(4, 0, 3));
        System.out.println(IfElseTaskSolver.checkMax(4, 10, 3));
        System.out.println(IfElseTaskSolver.checkMax(4, 10, 30));

        System.out.println(SwitchTaskSolver.showDayOfWeek(3));

        System.out.println(SwitchTaskSolver.describeSeason(Season.AUTUMN));

        ForTaskSolver.multiplicationTable(4);;

        System.out.println(ForTaskSolver.sum(10));





    }
}
