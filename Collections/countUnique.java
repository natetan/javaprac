public static int countUnique(List<Integer> list) {
	// ninja af
	return new HashSet<Integer>(list).size();
}
