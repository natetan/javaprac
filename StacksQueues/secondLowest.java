/*
    * takes a Queue of integers as a parameter, Queue will not be null
    * Returns an integer for the second to lowest absolute value in the queue
    * Second to lowest absolute value in the queue will be moved to the end.
    * Multiple occurrences will also be moved to end
    * order of non-second to lowest absolute value numbers will be preserved
    * throws illegalArgumentException if the size of the queue is less than 2
*/

public static int secondLowest(Queue<Integer> q) {
	if (q.size() < 2) {
		throw new IllegalArgumentException();
	}
	Stack<Integer> s = new Stack<Integer>();
	int min = q.remove();
	q.add(min);
	int secondMin = min;
	int size = q.size();

	// find min && second min
	// 1 1 3 3 2 1 2 5
	// 1 1
	for (int i = 0; i < size; i++) {
		int num = q.remove();
		if (num < min) {
			secondMin = min;
			min = num;
		} else if (num < secondMin && num != min) {
			secondMin = num;
		} else if (num > secondMin && secondMin == min) {
			secondMin = num;
		}
		q.add(num);
	}

	// required to finish program
	for (int i = 0; i < size; i++) {
		int num = q.remove();
		if (num == secondMin) {
			s.push(num);
		} else {
			q.add(num);
		}
	}

	while (!s.isEmpty()) {
		q.add(s.pop());
	}
	return secondMin;

}

// 12345, 1
// n = 12345, min = 1
private int getSecondLowest(int n, int min) {
	if (n / 10 == 0) {
		if (n > min) {
			return n;
		} else {
			return min;
		}
	} else {
		if (n % 10 != min) {
			return Math.min(n % 10, getSecondLowest(n / 10, min));
		} else {
			return getSecondLowest(n / 10, min);
		}
	}
}