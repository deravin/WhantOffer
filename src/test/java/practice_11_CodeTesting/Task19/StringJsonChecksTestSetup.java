package practice_11_CodeTesting.Task19;

import org.junit.jupiter.api.BeforeEach;

public class StringJsonChecksTestSetup {
    protected StringJsonChecks stringJsonChecks;
    @BeforeEach
    public void setStringJsonChecks(){
        stringJsonChecks = new StringJsonChecks();
    }
}
