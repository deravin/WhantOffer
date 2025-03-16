package Practice_7.ArrayDeque.Task5;

import java.util.ArrayDeque;

public class Palindrom {
    //Реализуйте метод, который проверяет симметричность строки (палиндром) с использованием ArrayDeque.
    private ArrayDeque<String> symbol;
    public Palindrom(){
        this.symbol = new ArrayDeque<>();
    }
    public void addSymbol(String s){
        symbol.addFirst(s);
    }
    public boolean isPalindrom(){
        while (symbol.size() > 3) {
            if (symbol.getFirst().equals(symbol.getLast())) {
                symbol.removeFirst();
                symbol.removeLast();
            }
            return symbol.getFirst().equals(symbol.getLast());
        }
        return symbol.getFirst().equals(symbol.getLast());
    }
    public void print(){
        symbol.forEach(el -> System.out.print(el + " "));
        System.out.println();
    }
}
