package practice_11_CodeTesting.Task7;


import org.junit.jupiter.api.BeforeEach;

public class FactorialTestSetup {
    protected Factorial factorial;
    @BeforeEach
    public void setFactorial(){
        factorial = new Factorial();
    }
}
