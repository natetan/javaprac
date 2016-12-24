public void removeEvenLength(Set<String> set) {
	Set<String> storage = new HashSet<String>(set);
	set.clear();
	for (String word : storage) {
		if (word.length() % 2 != 0) {
			set.add(word);
		}
	}
}