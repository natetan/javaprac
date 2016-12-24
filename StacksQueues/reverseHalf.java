public static void reverseHalf(Queue<Integer> q) {
  if (q.size() > 1) {
    Stack<Integer> s = new Stack<Integer>();
    int size = q.size();
    for (int i = 0; i < size / 2; i++) {
      q.add(q.remove());
      s.push(q.remove());
    }
    if (size % 2 == 1) {
      q.add(q.remove());
    }
    while (!s.isEmpty()) {
      q.add(q.remove());
      q.add(s.pop());
    }
    if (size % 2 == 1) {
      q.add(q.remove());
    }
  }
}