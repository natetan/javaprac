public static void switchPairs(Stack<Integer> s) {
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
        if (q.size() == 1) {
            s.push(q.dequeue());
            break;
        }
        int num1 = q.dequeue();
        int num2 = q.dequeue();
        s.push(num2);
        s.push(num1);
    }
}