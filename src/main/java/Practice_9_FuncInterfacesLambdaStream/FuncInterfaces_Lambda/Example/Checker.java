package Practice_9_FuncInterfacesLambdaStream.FuncInterfaces_Lambda.Example;
@FunctionalInterface
public interface Checker {
    // проверяет удовлетворяет ли число условию
    // добавить метод по умолчанию, кот. печает число если оно проходит проверку

    boolean check(int number);

    default void printIfValid(int number){
        if (check(number)){
            System.out.println(number);
        }
    }

}
