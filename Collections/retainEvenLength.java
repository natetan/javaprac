public static void retainEvenLength(Set<String> set) {
	Iterator<Integer> i = set.iterator();
	while (i.hasNext()) {
		if (i.next().length() % 2 == 1) {
			i.remove();
		}
	}
}
