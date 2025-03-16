package Practice_7.OtherTasks.Task4;

public enum Priority {
    URGENT(0),
    HIGH(1),
    NORMAL(2),
    LOW(3);

    public final int priorityValue;
    Priority(int value){
        this.priorityValue = value;
    }

    public int getPriorityValue(){
        return priorityValue;
    }
}
