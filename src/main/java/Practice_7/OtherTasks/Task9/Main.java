package Practice_7.OtherTasks.Task9;

public class Main {
    public static void main(String[] args) {
        History history = new History();
        history.addAction("Step1");
        history.addAction("Step2");
        history.addAction("Step3");
        history.addAction("Step4");
        history.addAction("Step5");

        history.printHistory();
        history.cancelAction();

        history.printHistory();

        history.turnBackCanceledAction();

        history.printHistory();

        history.deleteLastAction();
        history.deleteLastAction();
        history.deleteLastAction();

        history.printHistory();

    }
}
