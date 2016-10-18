public static int numInCommon(List<Integer> list1, List<Integer> list2) {
	Set<Integer> set = new HashSet<Integer>();
	for (int n : list1) {
		set.add(n);
	}
	int uniques = 0;
	for (int n : list2) {
		if (set.contains(n)) {
			uniques++;
		}
	}
	return uniques;
}
