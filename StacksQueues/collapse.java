public static void collapse(Stack<Integer> s) {
	Queue<Integer> q = new LinkedList<Integer>();
	while (!s.isEmpty()) {
		q.add(s.pop());
	}
	while (!q.isEmpty()) {
		s.push(q.remove());
	}
	while (!s.isEmpty()) {
		q.add(s.pop());
	}
	while (!q.isEmpty()) {
		if (q.size() == 1) {
			s.push(q.remove());
		} else {
			s.push(q.remove() + q.remove());
		}
	}
}