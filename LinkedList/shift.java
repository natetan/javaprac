public void shift() {
	if (this.front != null && this.front.next != null) {
	// size > 2, guaranteed
		ListNode current = this.front;
		ListNode current2 = this.front.next;
		ListNode current2front = current2;
		while (current != null && current.next != null && current.next.next != null) {
			current.next = current2.next;
			current2.next = current2.next.next;
			current = current.next;
			current2 = current2.next;
		}
		current.next = current2front;
	}
}