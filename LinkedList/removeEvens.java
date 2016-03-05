public LinkedIntList removeEvens() {
    LinkedIntList list2 = new LinkedIntList();
    if (this.front == null) {
        return list2;
    } else {
        list2.front = this.front;
        this.front = this.front.next;
        ListNode current = this.front;
        ListNode current2 = list2.front;
        while (current != null && current.next != null) {
            current2.next = current.next;
            current.next = current.next.next;
            current2 = current2.next;
            current = current.next;
        }
        current2.next = null;
    }
    return list2;
}