public void retainAll(Set<Integer> first, Set<Integer> second) {
	Iterator<Integer> i = first.iterator();
	while (i.hasNext()) {
		int n = i.next();
		if (!second.contains(n)) {
			i.remove();
		}
	}
}
