public void doubleList() {
    if (this.front != null) {
        ListNode current = this.front;
        ListNode list2 = new ListNode(current.data);
        ListNode current2 = list2;
        while (current.next != null) {
            current = current.next;
            current2.next = new ListNode(current.data);
            current2 = current2.next;
        }
        current.next = list2;
    }
}