public void reorder3() {
	if (this.front != null && this.front.next != null) {
		// there are at least 2 nums
		// 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8
		ListNode temp = front.next.next; // t -> 3
		front.next.next = front; // 2 -> 1
		front.next.next.next = temp; // 1 -> 3
		front = front.next; // 2 -> 1 -> 3
		ListNode current = front.next.next;
		while (current.next != null && current.next.next != null) {
			ListNode temp2 = current.next.next // t2 -> 5
			temp2.next = current.next; // 5 -> 4
			temp2.next.next = current.next.next.next; // 4 -> 6
			current.next = temp2.next; // 5 -> 4 -> 6
			current = current.next.next.next;
		}
	}
}
		
