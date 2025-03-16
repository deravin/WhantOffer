package Practice_7.OtherTasks.Task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RequestQueue {
    //Система должна обрабатывать запросы в порядке их поступления.
    // Требуется поддерживать последовательность.
    private Queue<String> requests;
    public RequestQueue(){
        this.requests = new LinkedList<>();
    }
    public void addRequest(String request){
        requests.add(request);
    }
    public void printList(){
        System.out.println(requests);
    }
    public String pollRequest(){
        String req = requests.poll();
        return req;
    }

}
