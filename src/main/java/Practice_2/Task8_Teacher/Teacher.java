package Practice_2.Task8_Teacher;

public class Teacher {
    String name;
    String subject;

    Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    String getName(){
        return name;
    }
    String getSubject(){
        return subject;
    }
    void setName(String name){
        this.name = name;
    }
    void setSubject(String subject){
        this.subject = subject;
    }
    void printInfo(){
        System.out.println("Учитель: " + name + ", Предмет: " + subject);
    }

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Анна Ивановна", "ОБЖ");
        teacher1.setSubject("Математика");
        teacher1.printInfo();
    }
}
