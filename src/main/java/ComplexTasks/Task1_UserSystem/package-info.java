package ComplexTasks.Task1_UserSystem;
/**
 * 1. Система управления пользователями
 *
 * Описание:
 * Реализовать систему управления пользователями с возможностью
 * - регистрации,
 * - авторизации и
 * - управления учетными записями.
 *
 * Сущности:
 * User: id, username, passwordHash, role (USER, ADMIN), createdAt.
 * Admin: наследует User, имеет расширенные права.
 * AuthenticationService: выполняет авторизацию и аутентификацию.
 *
 * Действия:
 * Регистрация нового пользователя.
 * Авторизация (логин/пароль).
 * Назначение ролей (USER, ADMIN).
 * Изменение пароля.
 * Получение списка пользователей.
 * Поиск пользователей по ролям.
 *
 * Ограничения:
 * Логин должен быть уникальным.
 * Пароль должен храниться в хешированном виде.
 * Администратор может удалять пользователей.
 *
 * Технические аспекты:
 *
 * Исключения:
 * UserAlreadyExistsException, если username уже существует.
 * InvalidCredentialsException, если пароль неверный.
 *
 * Коллекции:
 * Map<String, User> (ключ — username).
 *
 * Stream API:
 * Фильтрация пользователей по роли.
 *
 * Многопоточность:
 * Одновременный вход нескольких пользователей (использовать synchronized).
 *
 * Тестирование:
 * Проверка регистрации, входа, смены пароля, удаления пользователя.
 */