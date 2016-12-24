public static Set<String> commonFirstLetters(List<String> list) {
	Set<String> dupes = new HashSet<String>();
	Set<String> uniques = new HashSet<String>();
	for (int i = 0; i < list.size(); i++) {
		String letter = list.get(i).substring(0, 1).toLowerCase();
		if (uniques.contains(letter)) {
			dupes.add(letter);
		} else {
			uniques.add(letter);
		}
	}
	return dupes;
}