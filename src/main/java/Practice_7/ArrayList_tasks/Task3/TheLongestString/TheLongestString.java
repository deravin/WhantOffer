package Practice_7.ArrayList_tasks.Task3.TheLongestString;

import java.util.ArrayList;

public class TheLongestString {
    ArrayList <String> strings;

    public TheLongestString(){
        this.strings = new ArrayList<>();
    }

    public void addString(String string){
        strings.add(string);
    }

    public void print(){
        strings.forEach(string -> System.out.println(string.length()));
    }

    public void findLongestString(){
        int length = 0;
        String goalString=null;
        for (String string : strings){
            if (string.length() > length){
                length = string.length();
                goalString = string;
            }
        }
        System.out.println(goalString);
    }
}
