public static boolean hasOdd(Set<Integer> set) {
	for (int n : set) {
		if (n % 2 == 1) {
			return true;
		}
	}
	return false;
}