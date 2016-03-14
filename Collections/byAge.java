public static Map<Integer, String> byAge(Map<String, Integer> map, int min, int max) {
	SortedMap<Integer, String> newMap = new TreeMap<Integer, String>();
	for (String name : map.keySet()) {
		int age = map.get(name);
		if (!newMap.containsKey(age)) {
			newMap.put(age, name);
		} else {
			newMap.get(age) += " and " + name;
		}
	}
	return newMap;
}
