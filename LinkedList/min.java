public int min() {
    if (this.front == null) {
        throw new NoSuchElementException();
    }
    int min = this.front.data;
    if (this.front.next == null) {
        return this.front.data;
    } else {
        ListNode current = this.front;
        while (current != null) {
            min = Math.min(current.data, min);
            current = current.next;
        }
    }
    return (int)Math.floor(Math.min(min, min));
}