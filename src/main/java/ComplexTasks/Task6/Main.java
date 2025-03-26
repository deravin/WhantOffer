package ComplexTasks.Task6;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Task task1 = new Task(1, Status.OPEN, Priority.HIGH, 20252603);
        Task task2 = new Task(2, Status.CLOSED, Priority.LOW, 20252503);
        Task task3 = new Task(3, Status.CLOSED, Priority.CRITICAL, 20252403);
        Task task4 = new Task(4, Status.OPEN, Priority.LOW, 20252303);

        TaskService.addTaskToList(task1);
        TaskService.addTaskToList(task2);
        TaskService.addTaskToList(task3);
        TaskService.addTaskToList(task4);

        TaskService.filterByPriority(Priority.LOW).forEach(System.out::print);
        TaskService.filterByStatus(Status.OPEN).forEach(System.out::println);
        TaskService.sortingByData().forEach(System.out::print);

        TaskService taskService = new TaskService();

        Thread t1 = new Thread(
                () -> taskService.deleteTask(1)
        );
        Thread t2 = new Thread(
                () -> taskService.deleteTask(2)
        );

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println();
        TaskService.taskList.forEach(System.out::print);


    }
}
