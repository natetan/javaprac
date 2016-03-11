public static int recordDate(Map<String, List<String>>, String first, String second) {
	if (!map.containsKey(first)) {
		map.put(first, new LinkedList<String>());
	} 
	if (!map.containsKey(second)) {
		map.put(second, new LinkedList<String>());
	}
	LinkedList list1 = map.get(first);
	LinkedList list2 = map.get(second);
	list1.add(second, 0);
	list2.add(first, 0);
	int count = 0;
	LinkedList list = map.get(first);
	for (String name : list) {
		if (name.equals(second)) {
			count++;
		}
	}
	return count;
}
