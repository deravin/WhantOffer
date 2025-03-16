package Practice_9_FuncInterfacesLambdaStream.FuncInterfaces_Lambda.Task2;

public class Main {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

        r1.run();
    }
}
