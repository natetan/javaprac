public static int rarest(Map<String, Integer> map) {
	Map<Integer, Integer> newMap = new TreeMap<Integer, Integer>();
	for (int age : map.values()) {
		if (!newMap.containsKey(age)) {
			newMap.put(age, 1);
		} else {
			newMap.put(age, newMap.get(age) + 1);
		}
	}
	int minCount = Integer.MAX_VALUE;
	int minAge = 0;
	for (int age : newMap.keySet()) {
		if (newMap.get(age) < minCount) {
			minCount = newMap.get(age);
			minAge = age;
		}
	}
	return minAge;
}
