public static boolean equals(Set<Integer> s1, Set<Integer> s2) {
	if (s1.size() != s2.size()) {
		return false;
	}
	for (int n : s1) {
		if (!s2.contains(n)) {
			return false;
		}
	}
	return true;
}