package practice_11_CodeTesting.Task4;

import org.junit.jupiter.api.BeforeEach;

public class MaxNumberFinderTestSetup {
    protected MaxNumberFinder maxNumberFinder;
    @BeforeEach
    public void setMaxNumberFinder(){
        maxNumberFinder = new MaxNumberFinder();
    }
}
