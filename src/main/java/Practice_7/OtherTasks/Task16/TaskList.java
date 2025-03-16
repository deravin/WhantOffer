package Practice_7.OtherTasks.Task16;


import java.util.ArrayList;
import java.util.Comparator;

public class TaskList {
    //16. Список дел
    //Требуется сохранить список задач, который можно пополнять, удалять и сортировать по сроку выполнения.
    private ArrayList<Task> taskList;
    public TaskList(){
        this.taskList = new ArrayList<>();
    }
    public void addTask(Task task){
        taskList.add(task);
    }
    public void removeTask(Task task){
        taskList.remove(task);
    }
    public void printSortedList(){
        taskList.sort(Comparator.comparingInt(task -> task.dueTime));
        for (Task task : taskList){
            System.out.println(task);
        }
    }


}
