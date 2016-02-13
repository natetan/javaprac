public static void parenthesize(int n) {
    if (n < 2) {
        System.out.print(n);
    } else {
        if (n % 2 == 0) {
            System.out.print("(" + n + " + ");
            parenthesize(n - 1);
            System.out.print(")");
        } else {
            System.out.print("(");
            parenthesize(n - 1);
            System.out.print(" + " + n + ")");
        }
    }
}            /*
                    ( + p(6) + + 7)
                         (6 + + p(5) + )
                                 ( + p(4) + + 5)
                                     (4 + + p(3) + )
                                             ( + p(2) + + 3)
                                                 (2 + + p(1) + )
                                                          1
                                                          ((6 + ((4 + ((2 + 1) + 3)) + 5)) + 7)
              */
