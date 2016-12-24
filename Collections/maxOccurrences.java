public static int maxOccurrences(List<Integer> list) {
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	int max = 0;
	for (int num : list) {
		if (map.containsKey(num)) {
			map.put(num, map.get(num) + 1);
		} else {
			map.put(num, 1);
		}
		max = Math.max(map.get(num), max);
	}
	return max;
}