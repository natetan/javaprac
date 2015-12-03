public static void collapse(Stack<Integer> s) {
    Queue<Integer> q = new FIFOQueue<Integer>();
    while (!s.isEmpty()) {
        q.enqueue(s.pop());
    }
    while (!q.isEmpty()) {
        s.push(q.dequeue());
    }
    while (!s.isEmpty()) {
        q.enqueue(s.pop());
    }
    while (!q.isEmpty()) {
        if (q.size() == 1) {
            s.push(q.dequeue());
        } else {
            s.push(q.dequeue() + q.dequeue());
        }
    }
}