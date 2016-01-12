public static int evenSum(List<Integer> list) {
	int sum = 0;
	int count = 0;
	for (int n : list) {
		if (count % 2 == 0) {
			sum += n;
		}
		count++;
	}
	return sum;
}