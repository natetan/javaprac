public static Map<Integer, Set<String>> split(Set<String> set) {
	Map<Integer, Set<String>> map = new TreeMap<Integer, Set<String>>();
	for (String s : set) {
		if (map.containsKey(s.length())) {
			map.get(s.length()).add(s);
		} else {
			map.put(s.length(), new TreeSet<String>);
		}
	}
	return map;
}