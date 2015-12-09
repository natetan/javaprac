public static String repeat(String s, int n) {
    if (n < 0) {
        throw new IllegalArgumentException();
    }
    if (n == 0) {
        return "";
    } else if (n % 2 == 0) {
        return repeat(s + s, n / 2);
    } else {
        return s + repeat(s, n - 1);
    }
}