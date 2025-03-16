package TasksFromInterview.Brackets;

import java.util.*;

public class Brackets {
    public static boolean isBracketsCorrect(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные ");
        String brackets = scanner.nextLine();

        // создали стек для хранения скобочек при проверке
        Stack<Character> stack = new Stack<>();

        // создаем словарь, где ключ - закрывающая скобка, значение - открывающая
        Map<Character, Character> bracketsList = Map.of(')','(','}','{',']','[');

        // цикл для разделения переданной строки по символам с помощью метода charAt(i)
        for (int i = 0; i < brackets.length(); i++){
            char currentSymbol = brackets.charAt(i);

            // проверяем является ли первый введенный символ открывающейся скобкой, то есть берем из словаря Значение.
            if (bracketsList.containsValue(currentSymbol)){
                // если да, то кладем в стек
                stack.push(currentSymbol);

                // иначе проверяем является ли символ закрывающей скобкой - то есть Ключом
            } else if (bracketsList.containsKey(currentSymbol)){
                    // если да, то исключаем негативные варианты, а именно
                    // 1. не пустой ли стек?
                    // 2. stack.pop() - вытащили первый элемент и посмотрели равен ли он ключу -
                    // то есть закрывающей скобке - bracketsList.get(currentSymbol)
                    if (stack.isEmpty() || stack.pop() != bracketsList.get(currentSymbol)){
                        return false; // Неправильное закрытие скобки
                    }
                }
            }
            return stack.isEmpty(); // Если стек пуст, значит, все скобки закрыты
    }

    public static void main(String[] args) {
        System.out.println(isBracketsCorrect());
    }
}

