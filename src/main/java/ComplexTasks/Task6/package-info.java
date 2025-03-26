package ComplexTasks.Task6;
/**
 * Разработайте сервис для управления задачами, который позволяет добавлять,
 * удалять и искать задачи по различным критериям. Каждая задача будет иметь уникальный идентификатор обобщённого типа, статус, приоритет и дату.
 *
 * Функциональные требования:
 * Классы и интерфейсы:
 * Task<T>: Класс, представляющий задачу. Должен содержать поля для ID, статуса, приоритета и даты.
 * TaskService<T>: Сервис для управления задачами, включающий методы для добавления, удаления и поиска задач.
 *
 * Управление задачами:
 * Добавление задачи: Метод для добавления новой задачи в список.
 * Удаление задачи: Метод для удаления задачи по ID. Метод должен быть синхронизирован для предотвращения конкурентного доступа.
 * Поиск задач: Методы для фильтрации задач по статусу и приоритету, а также сортировка задач по дате.
 *
 * Обработка данных:
 * Использование Stream API для фильтрации и сортировки задач.
 * Лямбда-выражения для сортировки задач по дате.
 */