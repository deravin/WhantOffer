package Practice_7.OtherTasks.Task15;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueOfPatients {
    //15. Структура электронной очереди
    //В поликлинике пациенты записываются в очередь, и каждый должен быть вызван в порядке записи.
    private Queue<String> patients;
    public QueueOfPatients(){
        this.patients = new ArrayDeque<>();
    }
    public void addPatient(String name){
        patients.add(name);
    }
    public String pollPatient(){
        return patients.poll();
    }
    public void printQueue(){
        System.out.println(patients);
    }
}
