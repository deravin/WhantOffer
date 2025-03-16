package Practice_7.OtherTasks.Task3;

import java.util.HashMap;

public class Settings {
    //Необходимо хранить настройки приложения, где каждый параметр имеет имя (ключ) и значение.
    private HashMap<String, String> settings;
    public Settings(){
        this.settings = new HashMap<>();
    }
    public void addSetting(String name, String value){
        settings.put(name, value);
    }
    public void printSettings(){
        settings.forEach((name, value) -> System.out.println( name + " : " + value));
    }
}
