package Practice_7.OtherTasks.Task6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SocialNetwork {
    //Управление друзьями пользователя
    //Требуется хранить связи между пользователями в социальной сети,
    // где каждый пользователь может быть связан с несколькими другими.

    private Map<String, Set<String>> socialNetwork;
    private Set<String> networks;
    public SocialNetwork(){
        this.socialNetwork = new HashMap<>();
        this.networks = new HashSet<>();
    }
    public void addUser (String useName){
        socialNetwork.put(useName, new HashSet<>());
    }

    public void addNetworkToUser(String userName, String link){
        socialNetwork.get(userName).add(link);
        socialNetwork.put(link, new HashSet<>());
        socialNetwork.get(link).add(userName);
    }

    public void printList(){
        System.out.println(socialNetwork);
    }

}
