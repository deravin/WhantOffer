package Practice_7.OtherTasks.Task6;

public class Main {
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork();
        socialNetwork.addUser("Anna");
        socialNetwork.addUser("Bob");
        socialNetwork.addUser("Kate");
        socialNetwork.addUser("Alice");

        socialNetwork.addNetworkToUser("Anna", "Katerine");
        socialNetwork.addNetworkToUser("Alice", "Jane");
        socialNetwork.printList();
        socialNetwork.addNetworkToUser("Alice", "Bob");

        socialNetwork.printList();
    }
}
