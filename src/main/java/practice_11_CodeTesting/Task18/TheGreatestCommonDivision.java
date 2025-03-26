package practice_11_CodeTesting.Task18;

class TheGreatestCommonDivision {
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
