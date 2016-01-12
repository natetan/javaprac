public static void switchPairs() {
	for (int i = 0; i < list.size() - 1; i++) {
		String temp = list.get(i);
		list.set(i, list.get(i + 1));
		list.set(i + 1, temp);
	}
}