package practice_11.Task4;

import java.util.Arrays;

public class MaxNumberFinder {
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }
}
