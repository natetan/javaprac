public static void writeSequence(int n) {
	if (n < 1) {
		throw new IllegalArgumentException("this looks hard");
	}
	if (n == 1) {
		System.out.print(1);
	} else if (n == 2) {
		System.out.print(1 + " " + 1);
	} else {
		System.out.print(n / 2 + n % 2 + " ");
		writeSequence(n - 2);
		// must add parens here bc of concatenation
		System.out.print(" " + (n / 2 + n % 2)); // <-- got #rekt
	}  
}