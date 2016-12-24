public static void compressDuplicates(Stack<Integer> s) {
  if (s.size() > 0) {
    Queue<Integer> q = new LinkedList<Integer>();
    int count= 1;
    int prev = s.pop();
    while (!s.isEmpty()) {
      int next = s.pop();
      if (prev == next) {
          count++;
      } else {
          q.add(prev);
          q.add(count);
          count = 1;
          prev = next;
      }
    }
    q.add(prev);
    q.add(count);
    while (!q.isEmpty()) {
        s.push(q.remove());
    }
    while (!s.isEmpty()) {
        q.add(s.pop());
    }
    while (!q.isEmpty()) {
        s.push(q.remove());
    }
  }
}