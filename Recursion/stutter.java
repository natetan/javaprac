public static void stutter(Stack<Integer> s) {
	if (s.size() == 1) {
		int num = s.pop();
		s.push(num);
		s.push(num);
	} else if (s.size() > 1) {
		int num = s.pop();
		stutter(s);
		s.push(num);
		s.push(num);
	}
}