public void addSorted(int n) {
	if (this.front == null || this.front.data >= n) {
		this.front = new ListNode(n, this.front);
	} else { // There's at least one element
		ListNode current = this.front;
		while (current.next != null && current.next.data < n) {
			current = current.next;
		} // 2 5 12, add 10
		current.next = new ListNode(n, current.next);
	}
}
