public static void reverse3(List<Integer> list) {
	for (int i = 0; i < list.size() - 3; i += 3) {
		int temp = list.get(i);
		list.set(i, list.get(i + 2));
		list.set(i + 2, temp);
	}
}