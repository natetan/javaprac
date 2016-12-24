public static boolean isSorted(Stack<Integer> s) {
  boolean sorted = true;
  if (s.size() < 2) {
    sorted = true;
  } else {
    Queue<Integer> q = new LinkedList<Integer>();
    int current;
    while (!s.isEmpty()) {
      int prev = s.pop();
      if (!s.isEmpty()) {
        current = s.pop();
        s.push(current);
        if (prev > current) {
            sorted = false;
        }
      }
      q.add(prev);
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
  }
  return sorted;
}