public static Set<String> common(List<String> list) {
	Set<String> set = new HashSet<String>();
	Map<String, Integer> map = new HashMap<String, Integer>();
	for (String s : list) {
		char c = s.toLowerCase(s.charAt(0));
		if (!map.containsKey("" + c)) {
			map.put("" + c, 1);
		} else {
			map.put("" + c, map.get("" + c) + 1);
		}
	}
	for (String key : map.keySet()) {
		if (map.get(key) > 1) {
			set.add(key);
		}
	}
	return set;
}
