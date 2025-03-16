package Practice_7.OtherTasks.Task2;

public class Main {
    public static void main(String[] args) {
        RequestQueue requests = new RequestQueue();
        requests.addRequest("Req1");
        requests.addRequest("Req2");
        requests.addRequest("Req3");
        requests.addRequest("Req4");
        requests.addRequest("Req5");

        requests.printList();
        System.out.println(requests.pollRequest());
        requests.printList();
        requests.addRequest("Req6");
        System.out.println(requests.pollRequest());
        requests.printList();
    }
}
