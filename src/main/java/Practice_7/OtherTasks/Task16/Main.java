package Practice_7.OtherTasks.Task16;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Task1", 20250205);
        Task task2 = new Task("Task2", 20250209);
        Task task3 = new Task("Task3", 20250206);
        Task task4 = new Task("Task4", 20250203);
        Task task5 = new Task("Task5", 20250201);

        TaskList taskList = new TaskList();
        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);
        taskList.addTask(task4);
        taskList.addTask(task5);

        taskList.removeTask(task3);

        taskList.printSortedList();
    }
}

