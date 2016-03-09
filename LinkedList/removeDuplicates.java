public void removeDuplicates() {
	if (this.front != null && this.front.next != null) {
		ListNode current = this.front; // c -> 14
		// 14 - 8 - 14 - 12 - 1 - 14 - 1
		while (current != null) {
			ListNode temp = current.next; // t -> 8
			while (temp.next != null) {
				if (current.data == temp.next.data) {
					temp.next = temp.next.next;
				} else {
					temp = temp.next;
				}
			}
			current = current.next;
		}
		if (this.front.data == this.front.next.data) {
			this.front = this.front.next;
		}
	}
}
