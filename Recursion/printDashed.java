public static void printDashed(int n) {
    if (n / 10 == 0) {
        System.out.print(n);
    } else {
        if (n < 10) {
            System.out.print("-");
            printDashed(-n);
        } else {
            printDashed(n / 10);
            System.out.print("-");
            System.out.print(n % 10);
        }
    }
}
