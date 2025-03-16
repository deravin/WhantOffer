package Practice_8_Exception.Task10;

public class TryCathFinally {
    // Контрольный finally: Напишите метод с try-catch-finally,
    // в котором finally выполняется даже при наличии return внутри try.
    public static String checkDataBaseConnection(){
        try {
            System.out.println("Подключение к базе");
            return "Подключение успешное";
        } finally {
            System.out.println("Работа завершена. Отключение от базы");
        }
    }

    public static void main(String[] args) {
        checkDataBaseConnection();
    }
}
