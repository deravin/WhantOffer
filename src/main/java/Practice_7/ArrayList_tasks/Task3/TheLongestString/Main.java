package Practice_7.ArrayList_tasks.Task3.TheLongestString;

public class Main {
    public static void main(String[] args) {
        ListOfStrings strings = new ListOfStrings();
        strings.addString("qwe");
        strings.addString("qwetyy");
        strings.addString("qw");
        strings.addString("qwqwerqwe");
        strings.addString("qi");

        strings.printStringInfo();

        System.out.println(strings.theBigestString());

    }
}
