package practice_11_CodeTesting.Task14;

import java.util.Arrays;

public class AverageNumber {
    public double findAverage(int[] numbers) {
        return Arrays.stream(numbers).average().orElseThrow();
    }
}
