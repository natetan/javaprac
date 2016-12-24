public static boolean isConsecutive(Stack<Integer> s) {
	if (s.size() < 2) {
		return true;
	} else {
		Queue<Integer> q = new LinkedList<Integer>();
		boolean cons = true;
		int prev = s.pop();
		while (!s.isEmpty()) {
			int next = s.pop();
			if (prev != next + 1) {
				cons = false;
			}
			q.add(prev);
			prev = next;
		}
		q.add(prev);
		while (!q.isEmpty()) {
			s.push(q.remove());
		}
		while (!s.isEmpty()) {
			q.add(s.pop());
		}
		while (!q.isEmpty()) {
			s.push(q.remove());
		}
		return cons;
	}
}