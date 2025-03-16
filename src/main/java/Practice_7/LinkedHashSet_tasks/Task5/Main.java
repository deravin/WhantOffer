package Practice_7.LinkedHashSet_tasks.Task5;

public class Main {
    public static void main(String[] args) {
        UnicActions actionList = new UnicActions();
        actionList.addAction("просмотр");
        actionList.addAction("чтение");
        actionList.addAction("скроллинг");
        actionList.addAction("просмотр");
        actionList.addAction("переход по ссылке");
        actionList.addAction("скроллинг");
        actionList.addAction("переход по ссылке");

        actionList.printList();
    }
}
