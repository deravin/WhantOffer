package ComplexTasks.Task2_DataValidator;

public class UserValidator {
    // validationEnabled флаг
    public static boolean validationEnabled;

    // Проверка имени: Имя должно быть не пустым и начинаться с заглавной буквы.
    public static void validateName(User user){
        if (validationEnabled) {
                String name = user.getUserName();
                if (name.isEmpty() || Character.isUpperCase(name.charAt(0))){
                    throw new InvalidUserException("Имя пользователя не прошло валидацию");
                }
            System.out.println("Валидация имени прошла успешно");
        }
    }

    //Проверка возраста: Возраст должен быть в пределах от 18 до 100 лет.
    public static void validateAge(User user){
        if (validationEnabled) {
                int age = user.getAge();
                if (age < 18 || age > 100){
                    throw new InvalidUserException("Возраст пользователя не прошел валидацию");
                } else
                    System.out.println("Валидация возраста прошла успешно");
        }
    }

    //Проверка email: Email должен соответствовать стандартному формату электронной почты.
    public static void validateEmail(User user) throws InvalidUserException{
        if (validationEnabled) {
                String email = user.getEmail();
                String correctEmail = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
                if (email == null || !email.matches(correctEmail)){
                    throw new InvalidUserException("Email пользователя не прошел валидацию");
                } else
                    System.out.println("Валидация Email прошла успешно");
                }
    }
}
