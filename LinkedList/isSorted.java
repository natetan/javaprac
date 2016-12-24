public boolean isSorted() {
	if (this.front == null || this.front.next == null) {
		return true;
	}
	ListNode current = this.front;
	while (current != null && current.next != null) {
		if (current.data > current.next.data) {
			return false;
		}
		current = current.next;
	}
	return true;
}