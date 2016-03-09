public void takeSmallerFrom(LinkedIntList list2) {
	if (this.front != null && list2.front != null) {
		ListNode current = this.front;
		ListNode current2 = list2.front;
		while (current.next != null && current2.next != null) {
			if (current.next.data > current2.next.data) {
				ListNode temp = current.next;
				current.next = current2.next;
				current2.next = temp;
				temp = temp.next;
				ListNode temp2 = current2.next.next;
				current.next.next = temp;
				current2.next.next = temp2;
			}
			current = current.next;
			current2 = current2.next;
		}
		if (this.front.data > list2.front.data) {
			ListNode temp = this.front;
			this.front = list2.front;
			list2.front = temp;
		}
	}
}
