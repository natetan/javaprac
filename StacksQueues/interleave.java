public static void interleave(Queue<Integer> q) {
	if (q.size() % 2 != 0) {
		throw new IllegalArgumentException();
	}
	Stack<Integer> s = new Stack<Integer>();
	int size = q.size() / 2;
	for (int i = 0; i < size; i++) {
		q.add(q.remove());
	}
	for (int i = 0; i < size; i++) {
		s.push(q.remove());
	}
	while (!s.isEmpty()) {
		q.add(s.pop());
	}
	for (int i = 0; i < size; i++) {
		q.add(q.remove());
	}
	for (int i = 0; i < size; i++) {
		s.push(q.remove());
	}
	for (int i = 0; i < size; i++) {
		q.add(q.remove());
		q.add(s.pop());
	}
}