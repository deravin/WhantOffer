package Practice_7.ArrayDeque.Task5_1;

import java.util.ArrayDeque;

public class PalindromCheck {
    //Реализуйте метод, который проверяет симметричность строки (палиндром) с использованием ArrayDeque.
    private ArrayDeque<String> symbol;
    public PalindromCheck(){
        this.symbol = new ArrayDeque<>();
    }
    public void addSymbol(String s){
        symbol.addLast(s);
    }
    public boolean checkIsStringPalindrom(){
        while (symbol.size() > 1){
            if (symbol.getFirst().equals(symbol.getLast())){
                symbol.removeFirst();
                symbol.removeLast();
            } else {
                return false;
            }
        }
        return true;
    }
}
