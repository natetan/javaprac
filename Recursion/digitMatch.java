public static int digitMatch(int num1, int num2) {
	if (num1 < 0 || num2 < 0) {
		throw new IllegalArgumentException();
	}
	if (num1 / 10 == 0 || num2 / 10 == 0) {
		if (num1 % 10 == num2 % 10) {
			return 1;
		} else {
			return 0;
		}
	} else if (num1 % 10 == num2 % 10) {
		return 1 + digitMatch(num1 / 10, num2 / 10);
	} else {
		return digitMatch(num1 / 10, num2 / 10);
	}
}