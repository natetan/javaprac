public static boolean isConsecutive(Stack<Integer> s) {
	Queue<Integer> q = new LinkedList<Integer>();
	boolean cons = true;
	// t 5 4 3 2 1 b
	int num2 = 0;
	while (!s.isEmpty()) {
		int num1 = s.pop(); // 1
		if (!s.isEmpty()) {
			num2 = s.pop();
			s.push(num2);
			if (num1 - 1 != num2) {
				cons = false;
			}
		}

		q.add(num1);
	}

	while (!q.isEmpty()) {
		s.push(q.remove());
	}

	while (!s.isEmpty()) {
		q.add(s.pop());
	}

	while (!q.isEmpty()) {
		s.push(q.remove());
	}

	return cons;
}