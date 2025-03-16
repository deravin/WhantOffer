package Practice_7.ArrayDeque.Task5;

public class Main {
    public static void main(String[] args) {
        Palindrom palindrom = new Palindrom();
        palindrom.addSymbol("h");
        palindrom.addSymbol("o");
        palindrom.addSymbol("p");
        palindrom.addSymbol("p");
        palindrom.addSymbol("p");
        palindrom.addSymbol("u");
        palindrom.addSymbol("p");

        System.out.println(palindrom.isPalindrom());

    }
}
