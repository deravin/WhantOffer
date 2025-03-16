package Practice_7.OtherTasks.Task12;
import java.util.Map;
import java.util.Stack;

public class Brackets {

    public static boolean isValidBrackets(String brackets){
        // создали стек для хранения скобочек при проверке
        Stack<String> stack = new Stack<>();
        // создаем словарь, где ключ - закрывающая скобка, значение - открывающая
        Map<String, String> bracketsList = Map.of(")","(","}","{","]","[");

        // цикл для разделения переданной строки по символам с помощью метода substring(i,i+1)
        for (int i = 0; i < brackets.length(); i++){
            String currentSymbol = brackets.substring(i,i+1);

        // проверяем является ли первый введенный символ открывающейся скобкой, то есть берем из словаря Значение.
        if (bracketsList.containsValue(currentSymbol)){
            // если да, то кладем ее в стек
            stack.push(currentSymbol);

        // иначе проверяем является ли символ закрывающей скобкой - то есть Ключом
        } else if (bracketsList.containsKey(currentSymbol)){
            // если да, то исключаем негативные варианты, а именно
            // 1. не пустой ли стек?
            // 2. stack.pop() - вытащили первый элемент и посмотрели равен ли он ключу -
            // то есть закрывающей скобке - bracketsList.get(currentSymbol)
            if (stack.isEmpty() || !stack.pop().equals(bracketsList.get(currentSymbol))){
                return false; // Неправильное закрытие скобки
            }
        }
        }
        return stack.isEmpty(); // Если стек пуст, значит, все скобки закрыты
    }
}
