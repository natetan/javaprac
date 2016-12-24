public static void shift(Stack<Integer> s, int n) {
	if (n > 0) {
		Queue<Integer> q = new LinkedList<Integer>();
		while (!s.isEmpty()) {
			q.add(s.pop());
		}
		//  f[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]b
		int rotations = q.size() - n;
		for (int i = 0; i < rotations; i++) {
			s.push(q.remove());
		}
		// f[6, 5, 4, 3, 2, 1]b
		// b[10, 9, 8, 7]t
		while (!s.isEmpty()) {
			q.add(s.pop());
		}
		// f[6, 5, 4, 3, 2, 1, 7, 8, 9, 10]b
		for (int i = 0; i < n; i++) {
			q.add(q.remove());
		}
		// f[7, 8, 9, 10, 6, 5, 4, 3, 2, 1]b
		while (!q.isEmpty()) {
			s.push(q.remove());
		}
	}
}