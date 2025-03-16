package Practice_3.Student;

public class Student {
    int age;
    String name;
    final static int MAX_YEARS = 11;
    static int studentCount;

    Student(int age, String name){
        this.age = age;
        this.name = name;
        studentCount ++;
    }

   static {
       studentCount = 0;
   }

    int getAge(){
        return age;
    }

    static void printMaxYears(){
        System.out.println(MAX_YEARS);
    }
}
