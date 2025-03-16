package Practice_7.ArrayDeque.Task4;

import java.util.ArrayDeque;

public class UndoRedoSystem {
    //Реализуйте систему отмены и повтора действий с ArrayDeque.
    private ArrayDeque<String> undoRedo;
    public UndoRedoSystem(){
        this.undoRedo = new ArrayDeque<>();
    }
    public void addAction(String action){
        undoRedo.addLast(action);
    }
    public void deleteLastAction(){
        undoRedo.removeLast();
    }
    public void printActions(){
        undoRedo.forEach(action -> System.out.print(action + " "));
        System.out.println();
    }
    public void copyAction(){
        undoRedo.addLast(undoRedo.getLast());
    }
}
