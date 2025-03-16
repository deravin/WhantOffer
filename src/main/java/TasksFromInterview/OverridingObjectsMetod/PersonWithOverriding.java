package TasksFromInterview.OverridingObjectsMetod;

import java.util.Objects;

public class PersonWithOverriding {
    String name;
    int age;
    public PersonWithOverriding(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;   // Проверяем, одинаковые ли ссылки
        if (obj == null || getClass() != obj.getClass()) return false;   // Проверяем null и классы

        PersonWithOverriding personNew = (PersonWithOverriding) obj; // Приводим к PersonWithOverriding, чтобы получить доступ к его полям
        return age == personNew.age && Objects.equals(name, personNew.name);  // Сравниваем значения
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, age);

    }
}
