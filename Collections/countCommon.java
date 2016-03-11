public static int countCommon(List<Integer> list1, List<Integer> list2) {
	Set<Integer> set1 = new HashSet(list1);
	Set<Integer> set2 = new HashSet(list2);
	int count = 0;
	for (int num : set1) {
		if (set2.contains(num)) {
			count++;
		}
	}
	return count;
}
