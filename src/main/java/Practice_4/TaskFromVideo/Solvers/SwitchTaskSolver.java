package Practice_4.TaskFromVideo.Solvers;

import Practice_4.TaskFromVideo.Season;

public class SwitchTaskSolver {
    public static String showDayOfWeek (int day){
        String dayOfWeek = "";
        switch (day){
            case 1:
                dayOfWeek = "mon";
                break;
            case 2:
                dayOfWeek = "tue";
                break;
            case 3:
                dayOfWeek = "wed";
                break;
            case 4:
                dayOfWeek = "fir";
                break;
            case 5:
                dayOfWeek = "fri";
                break;
            case 6:
                dayOfWeek = "sun";
                break;
            case 7:
                dayOfWeek = "sat";
                break;
            default:
                dayOfWeek = "несуществующий день недели";
        }
        return dayOfWeek;
    }

    public static String describeSeason(Season season){
       String desc = "";
        switch (season){
            case WINTER -> desc = "зима, холодно";
            case SUMMER -> desc = "лето, жарко";
            case SPRING -> desc = "весна, все цветет";
            case AUTUMN -> desc = "осень, др";
        }
        return desc;
    }


}
