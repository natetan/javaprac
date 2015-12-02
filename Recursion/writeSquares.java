public static void writeSquares(int n) {
    if (n < 1) {
        throw new IllegalArgumentException();
    }
    
    if (n == 1) {
        System.out.print(1);
    } else if (n % 2 != 0) {
        System.out.print((int)Math.pow(n, 2) + ", ");
        writeSquares(n - 1);
    } else {
        writeSquares(n - 1);
        System.out.print(", " + (int)Math.pow(n, 2));
    }
}