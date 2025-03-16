package Practice_7.OtherTasks.Task9;

import java.util.ArrayDeque;

public class History {
    //История действий пользователя
    //Необходимо хранить список последних действий пользователя, чтобы можно было отменить или повторить действия.

    private ArrayDeque<String> actions;
    public History(){
        this.actions = new ArrayDeque<>();
    }
    public void addAction(String action){
        actions.addLast(action);
    }
    public void deleteLastAction(){
        actions.removeLast();
    }
    public void repeatAction(){
        String lastAction = actions.getLast();
        actions.addLast(lastAction);
    }
    private String lastAction;
    public void cancelAction(){
        lastAction = actions.getLast();
        actions.removeLast();
    }
    public void turnBackCanceledAction(){
        actions.addLast(lastAction);
    }

    public void printHistory(){
        actions.forEach(action -> System.out.print(action + " "));
        System.out.println();
    }
}
