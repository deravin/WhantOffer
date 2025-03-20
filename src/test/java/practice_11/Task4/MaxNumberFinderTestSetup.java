package practice_11.Task4;

import org.junit.jupiter.api.BeforeEach;

public class MaxNumberFinderTestSetup {
    protected MaxNumberFinder maxNumberFinder;
    @BeforeEach
    public void setMaxNumberFinder(){
        maxNumberFinder = new MaxNumberFinder();
    }
}
