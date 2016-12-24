public int countDuplicates() {
	int count = 0;
	if (this.front == null || this.front.next == null) {
		return 0;
	} else { // size > 1
		ListNode current = this.front;
		while (current.next != null) {
			if (current.next.data == current.data) {
				count++;
			}
			current = current.next;
		}
	}
	return count;
}