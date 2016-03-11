public static Map<String, Set<String>> convert(Set<String> set) {
	Map<String, Set<String>> map = new TreeMap<String, Set<String>>();
	for (String s : set) {
		String prefix = s.substring(0, 3);
		if (!map.containsKey(prefix)) {
			map.put(prefix, new TreeSet<String>());
		}
		String suffix = substring(4);
		map.get(prefix).add(suffix);
	}
	return map;
}