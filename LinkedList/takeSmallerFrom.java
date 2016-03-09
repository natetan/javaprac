/* INCOMPLETE: for some reason, fails half the tests on practice it
 * output seems like it should be matching correctly, but the problem
 * on practice it seems inconsistent, where it uses the second list
 * first while other examples use the first list first. 
 * Inconsistency problems?
 */

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
