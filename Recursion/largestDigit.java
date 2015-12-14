public static int largestDigit(int n) {
    n = Math.abs(n);
    if (n / 10 == 0) {
        return n % 10;
    } else {
        return Math.max((n % 10), largestDigit(n / 10));
    }
}