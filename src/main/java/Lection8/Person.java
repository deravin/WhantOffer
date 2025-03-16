package Lection8;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Person that = (Person) obj;
        return this.name.equals(that.name) && this.age == that.age;
    }
    @Override
    public int hashCode(){
        int result = name != null ? name.hashCode() : 0;
        return result * 31 + age;
    }
    @Override
    public Person clone(){
        return new Person(this.name, this.age);
    }
}
