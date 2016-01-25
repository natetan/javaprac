public static void reverseHalf(Queue<Inteter> q) {
	// f[1 8 7 2 9 18 12 0]b
	Stack<Integer> s = new Stack<Integer>();
	int size = q.size() / 2;
	for (int i = 0; i < size; i++) {
		q.add(q.remove());
		s.push(q.remove());
	}
	// size = 8;
	// f[1 8 7 2 9 18 12 0]b
	// t[]b

	int 
}

/*

[a] = 13
n : 13
j = 2; j < 13
result = (a + i)
[aa


*/