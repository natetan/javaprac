public static int recordDate(Map<String, LinkedList<String>>, String first, String second) {
	if (!map.containsKey(first)) {
		map.put(first, new LinkedList<String>());
	} 
	if (!map.containsKey(second)) {
		map.put(second, new LinkedList<String>());
	}
	LinkedList list1 = map.get(first);
	LinkedList list2 = map.get(second);
	list1.front = new ListNode(second, list1.front);
	list2.front = new ListNode(first, list2.front);
	int count = 0;
	LinkedList list = map.get(first);
	ListNode current = list.front;
	while (current != null) {
		if (current.data.equals(second)) {
			count++;
		}
	}
	return count;
}
