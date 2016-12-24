public static Map<String, Integer> reverse(Map<Integer, String> m1) {
	Map<String, Integer> reverse = new HashMap<String, Integer>();
	for (int num : m1.keySet()) {
		reverse.put(m1.get(num), num);
	}
	return reverse;
}