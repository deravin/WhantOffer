package practice_11.Task14;

import org.junit.jupiter.api.BeforeEach;

public class AverageNumberTestSetup {
    protected AverageNumber averageNumber;
    @BeforeEach
    public void setAverageNumber(){
        averageNumber = new AverageNumber();
    }
}
