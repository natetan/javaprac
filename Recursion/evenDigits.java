public static int evenDigits(int n) {
    if (n / 10 == 0) {
        if (n % 2 == 0) {
            return n;
        } else {
            return 0;
        }
    } else {
        int num = n % 10;
        if (num % 2 == 0) {
            return 10 * evenDigits(n / 10) + num;
        } else {
            return evenDigits(n / 10);
        }
    }
}