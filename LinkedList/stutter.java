public void stutter() {
    if (this.front != null) {
        ListNode current = this.front;
        while (current != null) {
            current.next = new ListNode(current.data, current.next);
            current = current.next.next;
        }
    }
}