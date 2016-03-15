public void reorder() {
	if (this.front != null && this.front.next != null) {
		// at least 2
		ListNode current = this.front;
		if (current.next.data <= this.front.data) {
			ListNode temp = this.front;
			this.front = current.next;
			current.next = current.next.next;
			this.front.next = temp;
			current = current.next;
		}
		while (current != null && current.next != null) {
			if (current.next.data <= this.front.data) {
				temp = this.front;
				this.front = current.next;
				current.next = this.front.next;
				this.front.next = temp;
				current = current.next;
			}
		}
	}
}

