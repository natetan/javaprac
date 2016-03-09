public int evenSum() {
	int count = 0;
	int sum = 0;
	ListNode current = this.front;
	while (current != null) {
		if (count % 2 == 0) {
			sum += current.data;
		}
		current = current.next;
	}
	return sum;
}
