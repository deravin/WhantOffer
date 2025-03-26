package practice_11_CodeTesting.Task1;

import org.junit.jupiter.api.BeforeEach;

public class CheckingIsNumberEvenTestSetup {
    protected CheckingIsNumberEven checkingIsNumberEven;
    @BeforeEach
    public void setCheckingIsNumberEven(){
        checkingIsNumberEven = new CheckingIsNumberEven();
    }
}
