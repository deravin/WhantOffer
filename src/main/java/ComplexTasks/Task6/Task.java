package ComplexTasks.Task6;

public class Task <T> {
    private final T id;
    private Status status;
    private final Priority priority;
    private final int data;

    public Task(T id, Status status, Priority priority, int data){
        this.data = data;
        this.id = id;
        this.priority = priority;
        this.status = status;
    }

    public T getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    public int getData() {
        return data;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", status=" + status +
                ", priority=" + priority +
                ", data=" + data +
                '}';
    }
}
