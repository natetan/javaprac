public static SortedMap<String, List<String>> indexMap(List<String> list) {
	SortedMap<String, List<String>> map = new TreeMap<String, List<String>>();
	for (int i = 0; i < list.size(); i++) {
		String word = list.get(i);
		if (!map.containsKey(word)) {
			map.put(word, new ArrayList<String>());
		}
		map.get(word).add(i);
	}
	return map;
}
