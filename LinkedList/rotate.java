public void rotate() {
    if (this.front != null) {
        ListNode current = this.front;
        while (current.next != null) {
            current = current.next;
        }
        current.next = this.front;
        this.front = this.front.next;
        current.next.next = null;
    }
}