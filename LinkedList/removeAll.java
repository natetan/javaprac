public void removeAll(int n) {
	if (this.front != null) {
		ListNode current = this.front;
		while (current != null && current.next != null) {
			if (current.next.data == n) {
				current.next = current.next.next;        
			} else {
				current = current.next;
			}
		}
		if (this.front.data == n) {
			this.front = this.front.next;
		}
	}
}