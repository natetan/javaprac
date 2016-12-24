public static int removeMin(Stack<Integer> s) {
  Queue<Integer> q = new LinkedList<Integer>();
  int min = Integer.MAX_VALUE;
  while(!s.isEmpty()) {
    int value = s.pop();
    min = Math.min(value, min);
    q.add(value);
  }
  
  while (!q.isEmpty()) {
    int value = q.remove();
    if (value != min) {
        s.push(value);
    }
  }
  while (!s.isEmpty()) {
    q.add(s.pop());
  }
  while (!q.isEmpty()) {
    s.push(q.remove());
  }
  return min;
}