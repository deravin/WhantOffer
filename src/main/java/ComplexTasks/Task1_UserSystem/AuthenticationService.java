package ComplexTasks.Task1_UserSystem;

import ComplexTasks.Task1_UserSystem.Exceptions.InvalidCredentialsException;
import ComplexTasks.Task1_UserSystem.Exceptions.UserAlreadyExistsException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AuthenticationService {
    /**
     * Действия:
     *  * Регистрация нового пользователя. +
     *  * Авторизация (логин/пароль). +
     *  * Назначение ролей (USER, ADMIN).
     *  * Изменение пароля. +
     *  * Получение списка пользователей. +
     *  * Поиск пользователей по ролям.
     */

    public static HashMap<String, User> users = new HashMap<>();
    public static int idCounter = 0;

    // регистрация обычного пользователя
    public static User registerUser(String name, String password){
        if (users.containsKey(name)){
            throw new UserAlreadyExistsException("Пользователь " + name + " уже существует!");
        }
        return users.put(name, new User(idCounter++, name, password, Role.USER));
    }

    // регистрация админа
    public static User registerAdmin(String name, String password){
        if (users.containsKey(name)){
            throw new UserAlreadyExistsException("Пользователь " + name + " уже существует!");
        }
        return users.put(name, new Admin(idCounter++, name, password));
    }

    // авторизация
    public static boolean authorisation(String name, String password){
        User user = users.get(name);
        if (!users.containsKey(name) || !user.checkPassword(password)){
            throw new InvalidCredentialsException("Неверные логин или пароль");
        }
        return true;
    }

    // изменение пароля
    public static void changePassword(String name, String oldPassword, String newPassword){
        User user = users.get(name);
        if (!users.containsKey(name) || !user.checkPassword(oldPassword)){
            throw new InvalidCredentialsException("Такого пользователя не существует или пароли не совпадают");
        }
        user.changePassword(newPassword);
    }

    // получение списка пользователей
    public static List<User> getUserList(){
        return new ArrayList<>(users.values());
    }


}
