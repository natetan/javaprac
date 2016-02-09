public static void switchPairs(Stack<Integer> s) {
    if (s.size() > 1) {
        Queue<Integer> q = new LinkedList<Integer>();
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        while (!q.isEmpty()) {
            int prev = q.remove();
            if (!q.isEmpty()) {
                int current = q.remove();
                s.push(current);
                s.push(prev);
            } else { // odd case
                s.push(prev);
            }
        }
    }
}