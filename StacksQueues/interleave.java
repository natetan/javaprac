public void interleave(Queue<Integer> q) {
    if (q.size() % 2 == 1) {
        throw new IllegalArgumentException();
    }
    int size = q.size();
    Stack<Integer> s = new ArrayStack<Integer>();
    for (int i = 0; i < size / 2; i++) {
        s.push(q.dequeue());
    }
    while (!s.isEmpty()) {
        q.enqueue(s.pop());
    }
    
    for (int i = 0; i < size / 2; i++) {
        s.push(q.dequeue());
    }
    while (!s.isEmpty()) {
        q.enqueue(s.pop());
    }
    for (int i = 0; i < size / 2; i++) {
        s.push(q.dequeue());
    }
    for (int i = 0; i < size / 2; i++) {
        s.push(q.dequeue());
    }
    for (int i = 0; i < size / 2; i++) {
        q.enqueue(s.pop());
    }
    for (int i = 0; i < size / 2; i++) {
        q.enqueue(s.pop());
        q.enqueue(q.dequeue());
    }
}