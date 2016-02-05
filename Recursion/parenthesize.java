public static void parenthesize(String s, int n) {
	if (n < 0) {
		throw new IllegalArgumentException();
	}
	if (n == 0) {
		System.out.print(s);
	} else {
		System.out.print("(");
		parenthesize(s, n - 1);
		System.out.print(")");
	}
}