package Lection8;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Cat: " + this.name + ", age: " + age;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        Cat that = (Cat) obj;
        return this.name.equals(that.name) && this.age == that.age;
    }
    @Override
    public int hashCode(){
        int result =  name != null ? name.hashCode() : 0;
        return result*31 + age;
    }
    @Override
    public Cat clone(){
        return new Cat(this.name,this.age);
    }
}
