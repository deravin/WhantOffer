package practice_11.Task1;

import org.junit.jupiter.api.BeforeEach;

public class CheckingIsNumberEvenTestSetup {
    protected CheckingIsNumberEven checkingIsNumberEven;
    @BeforeEach
    public void setCheckingIsNumberEven(){
        checkingIsNumberEven = new CheckingIsNumberEven();
    }
}
