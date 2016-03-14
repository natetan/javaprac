public static Map<Point, Integer> pointCount(List<Point> list) {
	Map<Point, Integer> map = new HashMap<Point, Integer>();
	for (Point p : list) {
		if (!map.containsKey(p)) {
			map.put(p, 1);
		} else {
			map.get(p) += 1;
		}
	}
	return map;
}
