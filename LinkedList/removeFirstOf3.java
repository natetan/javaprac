// 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8
// old list : 2 - 3 - 5 - 8
// new list : 1 - 4 - 7

public LinkedIntList removeFirstOf3() {
	if (front != null) {
		LinkedIntList list2 = new LinkedIntList();
		list2.front = front;
		front = front.next;
		ListNode current2 = list2.front;
		ListNode current = front.next;

		// blah blah blah
