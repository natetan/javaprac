public int deleteBack() {
	if (this.front == null) {
		throw new NoSuchElementException();
	}
	// list is not empty at this point
	int removal = this.front.data;
	if (this.front.next == null) {
		this.front = null;
		return removal;
	} else { // list has 2 or more ints
		ListNode current = this.front;
		while (current.next.next != null) {
			current = current.next;
		}
		removal = current.next.data;
		current.next = null;
		return removal;
	}
}	