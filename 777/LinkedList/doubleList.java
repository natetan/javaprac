public void doubleList() {
    if(front == null) {
        return;
    }
    ListNode current = front;
    ListNode end = front;
    int count = 0;
    while(end.next != null) {
        end = end.next;
        count++;
    }
    for(int i = 0; i < count + 1; i++) {
        end.next = new ListNode(current.data);
        end = end.next;
        current = current.next;
    }
}