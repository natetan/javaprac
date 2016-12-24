public void printPairsSwitched() {
	ListNode current = this.front;
	while (current != null && current.next != null) {
		System.out.print(current.next.data + " " + current.data + " ");
		current = current.next.next;
	}
	if (current != null && current.next == null) {
		System.out.print(current.data);
	}
	System.out.println();
}