package ComplexTasks.Task6;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService<T> {
    public static final LinkedList<Task> taskList = new LinkedList<>();

    // Добавление задачи: Метод для добавления новой задачи в список.
    public static void addTaskToList (Task task){
        taskList.add(task);
    }

    // Удаление задачи: Метод для удаления задачи по ID. Метод должен быть синхронизирован для предотвращения конкурентного доступа.
    public synchronized void deleteTask (T id){
        taskList.removeIf(task -> task.getId().equals(id));
    }

    // Метод для фильтрации задач по статусу
    public static List<Task> filterByStatus(Status status){
        return taskList.stream()
                .filter(task -> task.getStatus().equals(status))
                .collect(Collectors.toList());
    }

    // Метод для фильтрации задач по приоритету
    public static List<Task> filterByPriority(Priority priority){
        return taskList.stream()
                .filter(task -> task.getPriority().equals(priority))
                .collect(Collectors.toList());
    }

    // сортировка задач по дате
    public static List<Task> sortingByData(){
        return taskList.stream()
                .sorted(Comparator.comparing(Task::getData))
                .collect(Collectors.toList());
    }


}











