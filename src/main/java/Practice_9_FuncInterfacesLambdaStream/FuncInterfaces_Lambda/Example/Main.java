package Practice_9_FuncInterfacesLambdaStream.FuncInterfaces_Lambda.Example;

public class Main {
    public static void main(String[] args) {
        // анонимный класс
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Привет, мир");
            }
        };

        r1.run();

        Runnable r2 = () -> System.out.println("Привет, Настюша");

        r2.run();
    }
}
