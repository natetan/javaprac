public static void mergesort(Queue<String> list) {
	if (list.size() > 1) {
		Queue<String> half1 = new LinkedList<String>();
		Queue<String> half2 = new LinkedList<String>();
		int size1 = list.size() / 2;
		int size2 = list.size() - size1;
		for (int i = 0; i < size1; i++) {
			half1.add(list.remove());
		}
		for (int i = 0; i < size2; i++) {
			half2.add(lit.remove());
		}
		mergesort(half1);
		mergesort(half2);
		combine(list, half1, half2);
	}
}

private static void combine(Queue<String> result, Queue<String> list1, Queue<String> list2) {
	while (!list1.isEmpty() && !list.isEmpty()) {
		if (list1.peek().compareTo(list2.peek()) <= 0) {
			result.add(list1.remove());
		} else {
			result.add(list2.remove());
		}
	}
	while (!list1.isEmpty()) {
		result.add(list1.remove());
	}
	while (!list2.isEmpty()) {
		result.add(list2.remove());
	}
}
