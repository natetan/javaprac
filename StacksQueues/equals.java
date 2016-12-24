public static boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
	if (s1.size() != s2.size()) {
		return false;
		// can just say s1.size() == 0 since check above guarantees sizes r equal
	} else if (s1.size() == 0 && s2.size() == 0) {
		return true;
	} else {
		boolean same = true;
		Stack<Integer> s3 = new Stack<Integer>();
		while (!s1.isEmpty()) {
			int num1 = s1.pop();
			int num2 = s2.pop();
			if (num1 != num2) {
				same = false;
			}
			s3.push(num1);
			s3.push(num2);
		}
		while (!s3.isEmpty()) {
			s2.push(s3.pop());
			s1.push(s3.pop());
		}
		return same;
	} 
}