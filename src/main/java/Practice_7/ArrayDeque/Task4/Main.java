package Practice_7.ArrayDeque.Task4;

public class Main {
    public static void main(String[] args) {
        UndoRedoSystem undoRedoSystem = new UndoRedoSystem();
        undoRedoSystem.addAction("Read");
        undoRedoSystem.addAction("Cancel");
        undoRedoSystem.addAction("Delete");
        undoRedoSystem.addAction("Do");
        undoRedoSystem.addAction("Write");
        undoRedoSystem.addAction("Write");
        undoRedoSystem.copyAction();

        undoRedoSystem.printActions();

        undoRedoSystem.deleteLastAction();
        undoRedoSystem.deleteLastAction();
        undoRedoSystem.deleteLastAction();

        undoRedoSystem.printActions();

        undoRedoSystem.printActions();

    }
}
