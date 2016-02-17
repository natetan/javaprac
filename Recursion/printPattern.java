public static void showPattern(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("FAIL");
    }    
    if(n == 0) {
        System.out.print("");
    } else if(n == 1) {
        System.out.print(".");
    } else if(n == 2) {
        System.out.print("()");
    } else {
        if (n / 2 % 2 == 1) {
            System.out.print("(");
            showPattern(n - 2);
            System.out.print(")");
        } else {
            System.out.print("[");
            showPattern(n - 2);
            System.out.print("]"); 
        }
    }
}