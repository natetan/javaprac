public boolean bubble() {
	boolean change = false;
	if (this.front != null && this.front.next != null) {
		ListNode current = this.front;
		if (this.front.data > this.front.next.data) {
			ListNode temp = this.front.next;
			this.front.next = temp.next;
			temp.next = this.front;
			this.front = temp;
			change = true;
		}
		while (current.next != null && current.next.next != null) {
			if (current.next.data > current.next.next.data) {
				ListNode temp = current.nextt;
				current.next = temp.next;
				temp.next = temp.next.next;
				current.next.next = temp;
				change = true;
			}
			current = current.next;
		}
	}
	return change;
}
