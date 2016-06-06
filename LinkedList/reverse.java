// Reverses a LinkedList
public void reverse() {
	if (this.front != null && this.front.next != null) {
		ListNode current = this.front;
		ListNode prev = null;
		ListNode next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		this.front = prev;
	}
}
