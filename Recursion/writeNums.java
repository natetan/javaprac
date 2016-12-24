public void writeNums(int n) {
	if (n < 1) {
		throw new IllegalArgumentException();
	}
	// Base case
	if (n == 1) {
		System.out.print(n);
	} else {
		writeNums(n - 1);
		System.out.print(", " + n);
	}
}