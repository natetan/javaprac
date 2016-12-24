public static boolean digitsSorted(int n) {
	if (n < 0) {
		n = n * -1;
	}
	if (n / 10 == 0) {
		return true;
	} else {
	// 2+ digits
		if (n % 10 < n / 10 % 10) {
			return false;
		} else {
			return digitsSorted(n / 10);
		}
	}
}