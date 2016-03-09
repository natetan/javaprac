public void switchPairs() {
	if (this.front != null && this.front.next != null) {
		// 3 - 7 - 4 - 9 - 8 - 12
		ListNode temp = this.front.next; // t -> 7
		this.front.next = temp.next; // 3 -> 4
		temp.next = this.front; // 7 -> 3
		this.front = temp; // f -> 7
		ListNode current = temp.next; // c -> 3
		while (current != null && current.next != null && current.next.next != null) {
			temp = current.next; // t -> 4
			// 7 - 3 - 4 - 9 - 8 - 12
			// f   c   t
			current.next = temp.next; // 3 -> 9
			temp.next = temp.next.next; // 4 -> 8
			current.next.next = temp; // 9 -> 4
			current = current.next.next;
		}
	}
}

