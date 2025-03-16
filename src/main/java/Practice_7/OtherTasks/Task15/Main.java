package Practice_7.OtherTasks.Task15;

public class Main {
    public static void main(String[] args) {
        QueueOfPatients patients = new QueueOfPatients();
        patients.addPatient("Anna");
        patients.addPatient("Jane");
        patients.addPatient("Kate");
        patients.addPatient("Nina");
        patients.addPatient("Bob");


        patients.printQueue();
        System.out.println(patients.pollPatient());
        System.out.println(patients.pollPatient());
        patients.printQueue();
    }
}
