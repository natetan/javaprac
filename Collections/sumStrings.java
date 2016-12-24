public static Map<Point, Integer> sumStrings(Map<String, Point> map) {
	Map<Point, Integer> newMap = new HashMap<Point, Integer>();
	for (String s : map.keySet()) {
		if (!newMap.containsKey(map.get(s))) {
			newMap.put(map.get(s), s.length());
		} else {
			newMap.put(map.get(s), newMap.get(map.get(s)) + s.length());
		}
	}
	return newMap;
}