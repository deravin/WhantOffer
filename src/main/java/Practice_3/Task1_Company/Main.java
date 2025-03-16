package Practice_3.Task1_Company;

public class Main {
    public static void main(String[] args) {
        Company employee1 = new Company(1,"Sasha");
        Company employee2 = new Company(2, "Anna");

        Company.companyName = "TTF";
        System.out.println(Company.companyName);

    }
}
