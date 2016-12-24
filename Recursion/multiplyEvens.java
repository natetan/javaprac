public static int multiplyEvens(int n) {
	if (n <= 0) {
		throw new IllegalArgumentException();
	}
	if (n == 1) {
		return 2;
	} else {
		return (n * 2) * multiplyEvens(n - 1);
	}
}

// pub priv method

public static int multiplyEvens(int n) {
	if (n <= 0) {
		throw new IllegalArgumentException();
	}
	return multiplyEvens(n, n * 2);
}

private static int multiplyEvens(int n, int doubled) {
	if (n == 1) {
		return 2;
	} else {
		return doubled * multiplyEvens(n - 1, doubled - 2);
	}
}
