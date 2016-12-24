public static Map<Integer, Set<String>> split(Set<String> set) {
	Map<Integer, Set<String>> map = new TreeMap<Integer, Set<String>>();
	for (String s : set) {
		int length = s.length();
		if (!map.containsKey(length)) {
			map.put(length, new TreeSet<String>());
		}
		map.get(length).add(s);
	}
	return map;
}