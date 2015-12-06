public void stutter(Stack<Integer> s) {
    Queue<Integer> q = new FIFOQueue<Integer>();
    while (!s.isEmpty()) {
        q.enqueue(s.pop());
    }
    while (!q.isEmpty()) {
        s.push(q.dequeue());
    }
    while (!s.isEmpty()) {
        q.enqueue(s.pop());
    }
    while (!q.isEmpty()) {
        int num = q.dequeue();
        s.push(num);
        s.push(num);
    }
}