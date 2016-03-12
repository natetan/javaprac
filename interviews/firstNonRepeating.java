public static Character firstNonRepeating(String s) {
	Set<Character> uniques = new TreeSet<Character>();
	Set<Character> dupes = new TreeSet<Character>();
	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		if (uniques.contains(c)) {
			dupes.add(c);
		} else {
			uniques.add(c);
		}
	}
	return uniques.iterator().next();
}
