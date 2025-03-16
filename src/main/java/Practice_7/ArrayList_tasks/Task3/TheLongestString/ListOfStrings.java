package Practice_7.ArrayList_tasks.Task3.TheLongestString;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListOfStrings {
    private ArrayList<String> strings;

    public ListOfStrings(){
        this.strings = new ArrayList<>();
    }

    public void addString(String string){
        strings.add(string);
    }

    public void printStringInfo(){
        strings.forEach(System.out::println);
        System.out.println();
    }

    public String theBigestString(){
        int length = 0;
        String theBigestString = null;

        for (String string : strings){
            if (string.length() > length){
                length = string.length();
                theBigestString = string;
            }
        }
        return theBigestString;
    }
}
