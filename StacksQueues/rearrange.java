public static void rearrange(Queue<Integer> q) {
  if (q.size() > 1) {
    Stack<Integer> s = new Stack<Integer>();
    int size = q.size();
    // f[-3, -1, 0, 1, 3]b
    for (int i = 0; i < size; i++) {
      int num = q.remove();
      if (num % 2 == 1 || num % 2 == -1) {
        s.push(num);
      } else {
        q.add(num);
      }
    }
    // f[0]b
    // t[3 1 -1 -3]b
    int rotations = q.size(); // 1
    while (!s.isEmpty()) {
      q.add(s.pop());
    }
    // [0 3 1 -1 -3]
    for (int i = 0; i < rotations; i++) {
      q.add(q.remove());
    }
    // [3 1 -1 -3 0]
    // 4 times
    for (int i = 0; i < size - rotations;  i++) {
      s.push(q.remove());
    }
    // f[0]b
    // t[-3 -1 1 3]b
    while (!s.isEmpty()) {
      q.add(s.pop());
    }
    // [0 3 1 -1 -3]
  }
}