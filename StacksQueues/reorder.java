public static void reorder(Queue<Integer> q) {
	Stack<Integer> s = new Stack<Integer>();
	int size = q.size();
	for (int i = 0; i < size; i++) {
		int num = q.remove();
		if (num >= 0) {
			q.add(num);
			} else { // negs are in stack reversed
				s.push(num);
			}
		}
	}
	int rotations = q.size();
	while (!s.isEmpty()) {
		q.add(s.pop());
	}
	for (int i = 0; i < rotations; i++) {
		q.add(q.remove());
	}
}