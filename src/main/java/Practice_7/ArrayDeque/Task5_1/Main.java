package Practice_7.ArrayDeque.Task5_1;

public class Main {
    public static void main(String[] args) {
        PalindromCheck string = new PalindromCheck();
        string.addSymbol("q");
        string.addSymbol("w");
        string.addSymbol("e");
        string.addSymbol("r");
        string.addSymbol("e");
        string.addSymbol("w");
        string.addSymbol("q");

        System.out.println(string.checkIsStringPalindrom());
    }
}
