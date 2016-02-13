public static void reverseByN(Queue<Integer> q, int n) {
    Stack<Integer> s = new Stack<Integer>();
    boolean done = false;
    if (n >= q.size()) {
        done = true;
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    if (q.size() > 1 && !done) {
        int rotations = q.size() / n;
        for (int i = 0; i < rotations; i++) {
            for (int j = 0; j < n; j++) {
                s.push(q.remove());
            }
            for (int j = 0; j < n; j++) {
                q.add(s.pop());
            }
        }
        if (q.size() % n != 0) {
            int remainder = rotations % n;
            for (int i = 0; i < remainder; i++) {
                s.push(q.remove());
            }
            while (!s.isEmpty()) {
                q.add(s.pop());
            }
        }
    }
}
