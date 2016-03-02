public void stretch(int n) {
    if (n < 1) {
        this.front = null;
    } else {
        ListNode current = this.front;
        while (current != null) {
            for (int i = 0; i < n - 1; i++) {
                current.next = new ListNode(current.data, current.next);
            }
            for (int i = 0; i < n; i++) {
                current = current.next;
            }
        }
    }
}