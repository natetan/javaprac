public static void mirrorHalves(Queue<Integer> q) {
    if (q == null || q.size() % 2 != 0) {
        throw new IllegalArgumentException();
    }
    Stack<Integer> s = new ArrayStack<Integer>();
    int size = q.size();
    for (int i = 0; i < size / 2; i++) {
        int temp = q.dequeue();
        s.push(temp);
        q.enqueue(temp);
    }
    while (!s.isEmpty()) {
        q.enqueue(s.pop());
    }
    for (int i = 0; i < size / 2; i++) {
        int temp = q.dequeue();
        s.push(temp);
        q.enqueue(temp);
    }
    while (!s.isEmpty()) {
        q.enqueue(s.pop());
    }
}