public static void removeInRange(ArrayList<Integer> list, int num, int start, int end) {
	for (int i = end - 1; i >= start; i--) {
		if (list.get(i) == num) {
			list.remove(i);
		}
	}
}