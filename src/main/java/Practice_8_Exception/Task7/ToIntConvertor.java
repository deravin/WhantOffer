package Practice_8_Exception.Task7;

public class ToIntConvertor {
    //Попытка преобразования строки в число:
    // Реализуйте метод, который принимает строку и преобразует её в число, обрабатывая NumberFormatException.
    public static int convertToInt(String string){
        int number=0;
        try {
            number = Integer.parseInt(string);
        } catch (NumberFormatException e){
            System.out.println("Ошибка конвертации, попробуйте еще раз");
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(convertToInt("ui"));
    }
}
