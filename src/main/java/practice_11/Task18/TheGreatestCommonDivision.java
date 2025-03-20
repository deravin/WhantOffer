package practice_11.Task18;

class TheGreatestCommonDivision {
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
