public static void printRange(int x, int y) {
	if (x > y) {
		throw new IllegalArgumentException();
	}
	if (x + 1 == y) {
		System.out.print(x);
		System.out.print(" - ");
		System.out.print(y);
	} else if (x == y) {
		System.out.print(x);
	} else {
		System.out.print(x + " > ");
		printRange(x + 1, y - 1);
		System.out.print(" < " + y);
	}
}
