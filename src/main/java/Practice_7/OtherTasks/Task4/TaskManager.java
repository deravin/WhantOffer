package Practice_7.OtherTasks.Task4;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeMap;

public class TaskManager {
    // Поиск элементов по приоритету.
    // Система обрабатывает задачи, причём приоритет задачи определяет, когда она будет выполнена.
    // ключ(приоритет) - значение(имя задачи)

    private TreeMap<Priority, LinkedList<String>> tasksWithPriority;
    private LinkedList<String> tasks;

    public TaskManager(){
        this.tasksWithPriority = new TreeMap<>(Comparator.comparingInt(Priority::getPriorityValue));
        this.tasks = new LinkedList<>();
    }

    public void addTask(String priority, String task){
        Priority taskPriority = Priority.valueOf(priority.toUpperCase());
        tasksWithPriority.putIfAbsent(taskPriority,new LinkedList<>());
        tasksWithPriority.get(taskPriority).add(task);
    }

    public void printTaskList(){
        System.out.println(tasksWithPriority);
    }

    public LinkedList<String> pollPriorityTask(Priority priority){
        return tasksWithPriority.get(priority);
    }

}