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
}
