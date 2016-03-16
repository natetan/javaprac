// method could be used to truncate to decimal value of n places

public double truncate(double num, int n) {
	if (n < 0) {
		throw new IllegalArgumentException();
	}
	if (n == 0) {
		return Math.round(num);
	} else {
		int places = Math.pow(10, n);
		return Math.round(num * places) / places;
	}
}
