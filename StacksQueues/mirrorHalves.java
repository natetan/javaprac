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

/* 2.15.16
Cleaner solution
*/
public static void mirrorHalves(Queue<Integer> q) {
    if (q == null || q.size() % 2 == 1) {
        throw new IllegalArgumentException();
    }
    Stack<Integer> s = new Stack<Integer>();
    int size = q.size();
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < size / 2; j++) {
            int num = q.remove();
            q.add(num);
            s.push(num);
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
}