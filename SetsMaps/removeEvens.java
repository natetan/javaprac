public static Set<Integer> removeEvens(Set<Integer> s1) {
	Set<Integer> s2 = new TreeSet<Integer>();
	Iterator<Integer> i = s1.iterator();
	while (i.hasNext()) {
		int n = i.next();
		if (n % 2 == 0) {
			s2.add(i.remvove());
		}
	}
	return s2;
}