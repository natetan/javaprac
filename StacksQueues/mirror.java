public static void mirror(Stack<Integer> s) {
    if (s == null) {
        throw new IllegalArgumentException();
    }
    if (s.size() > 0) {
        Queue<Integer> q = new LinkedList<Integer>();
        // b[1 2 3 4]t
        while (!s.isEmpty()) {
            int num = s.pop();
            q.add(num);
        }
        // f[4 3 2 1]b
        int size = q.size();
        for (int i = 0; i < size; i++) {
            int num = q.remove();
            s.push(num);
            q.add(num);
        }
        // f[4 3 2 1]b
        // b[4 3 2 1]t
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        // f[4 3 2 1 1 2 3 4]b
        for (int i = 0; i < size; i++) {
            q.add(q.remove());
        }
        // f[1 2 3 4 4 3 2 1]b
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    }
}