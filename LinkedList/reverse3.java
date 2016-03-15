public void reverse3() {
	if (this.front != null && this.front.next != null && this.front.next.next != null) {
		// list is at least of size 3
		ListNode temp = this.front.next.next.next; // t -> 4
		this.front.next.next.next = this.front.next; // 3 -> 2
		ListNode temp2 = this.front.next.next; // t2 -> 3
		this.front.next.next = this.front; // 2 -> 1
		this.front.next = temp; // 1 -> 4
		this.front = temp2; // f -> 3
		// Trailing case
		ListNode current = this.front.next.next; // c -> 1
		while (current.next != null && current.next.next != null && current.next.next.next != null) {
			current.next = current.next.next.next; // 1 -> 6
			ListNode temp3 = current.next.next.next.next; // t3 -> 6
			current.next.next.next.next = current.next.next; // 6 -> 5
			current.next.next.next = temp; // 5 -> 4
			temp.next = temp3; // 4 -> 7
			current = current.next.next.next; // c -> 4
		}
	}
}

			

