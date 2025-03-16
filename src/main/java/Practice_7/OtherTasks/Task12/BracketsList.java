package Practice_7.OtherTasks.Task12;

import java.util.Map;
import java.util.Stack;

public class BracketsList {
    //Проверка корректности скобочной последовательности
    //Пользователь вводит строку, содержащую скобки. Нужно определить, правильно ли расставлены скобки.

    public static boolean isBracketsListCorrect(String brackets){
        Stack<String> stack = new Stack<>();
        Map<String, String> bracketsPairs = Map.of(")","(","}","{","]","[");
        // ключ - key - закрывающиеся скобки
        // значение - value - открывающиеся скобки

        for (int i = 0; i < brackets.length(); i++){
            String currentSymbol = brackets.substring(i,i+1);
            if (bracketsPairs.containsValue(currentSymbol)){
                stack.push(currentSymbol);
            } else if (bracketsPairs.containsKey(currentSymbol)){
                if (stack.isEmpty() || !stack.pop().equals(bracketsPairs.get(currentSymbol))){
                    return false;
                }
            }
        }
        return true;
    }
}
