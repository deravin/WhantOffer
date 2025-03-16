package Practice_10_MultiThreads.Task1;

public class NewThread extends Thread{
    // Создайте класс, который наследуется от Thread.
    // В методе run() пусть поток выводит в консоль "Поток запущен", затем засыпает на 1 секунду, и после этого выводит "Поток завершен".

    public void run(){
        System.out.println("Поток запущен");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Поток завершен");
    }
}
