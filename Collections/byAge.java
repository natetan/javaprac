public static Map<Integer, String> byAge(Map<String, Integer> map, int min, int max) {
	SortedMap<Integer, String> newMap = new TreeMap<Integer, String>();
	for (String name : map.keySet()) {
		int age = map.get(name);
        if (age >= min && age <= max) {
            if (!newMap.containsKey(age)) {
                newMap.put(age, name);
            } else {
                String s = newMap.get(age);
                s += " and " + name;
                newMap.put(age, s);
            }
        }
	}
	return newMap;
}
