package Practice_2.Task1_Car;

public class Car {
    String brand;
    int year;

    Car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    String getBrand(){
        return brand;
    }
    int getYear(){
        return year;
    }
    void setBrand(String brand){
        this.brand = brand;
    }
    void setYear(int year){
        this.year = year;
    }

    void print(){
        System.out.println("Марка: " + brand + ", Год выпуска: " + year);
    }

}
