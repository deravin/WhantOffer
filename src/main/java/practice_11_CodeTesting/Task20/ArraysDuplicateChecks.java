package practice_11_CodeTesting.Task20;

import java.util.Arrays;

public class ArraysDuplicateChecks {
    public boolean hasDuplicates(int[] numbers) {
        return Arrays.stream(numbers).distinct().count() != numbers.length;
    }
}
