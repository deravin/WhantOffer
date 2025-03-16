package Practice_7.OtherTasks.Task4;

import static Practice_7.OtherTasks.Task4.Priority.*;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTask("URGENT", "Task1");
        taskManager.addTask("Low", "Task2");
        taskManager.addTask("URGENT", "Task3");
        taskManager.addTask("Normal", "Task4");
        taskManager.addTask("Low", "Task5");

        taskManager.printTaskList();
        System.out.println(taskManager.pollPriorityTask(URGENT));
        System.out.println(taskManager.pollPriorityTask(LOW));

    }
}
