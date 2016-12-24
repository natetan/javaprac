/* SECOND TIME SOLUTION*/
public static boolean isPalindrome(Queue<Integer> q) {
	Stack<Integer> s = new Stack<Integer>();
	boolean ok = true;
	int size = q.size();
	for (int i = 0; i < size; i++) {
		int num = q.remove();
		q.add(num);
		s.push(num);
	}
	while (!s.isEmpty()) {
		int num1 = s.pop();
		int num2 = q.remove();
		q.add(num2);
		if (num1 != num2) {
			ok = false;
		}
	}
	return ok;
}

/* FIRST EVER ATTEMPT. LOOKS BAD*/
public static boolean isPalindrome(Queue<Integer> q) {
  if (q.size() < 2) {
    return true;
  }
  int size = q.size();
  Stack<Integer> s = new ArrayStack<Integer>();
  boolean flag = true;
  for (int i = 0; i < size / 2; i++) {
    s.push(q.dequeue());
  }
  int middle = 0; // odd case
  if (size % 2 == 1) {
    middle = q.dequeue(); // remove it so it goes into the even case and gets fixed later
  }
  // Comparing halves of each queue for palindromity
  while (!s.isEmpty()) {
    int num1 = s.pop();
    int num2 = q.dequeue();
    if (num1 != num2) {
        flag = false;
    }
    q.enqueue(num1);
    q.enqueue(num2);
  }
  if (size % 2 == 1) { // pushes middle to middle spot
    s.push(middle);
  }
  
  
  // Rearranges the messed up order
  for (int i = 0; i < size / 2; i++) {
    // since i did what i did in lines 22 and 23, the nums are in subsequent order, 162534
    q.enqueue(q.dequeue()); // separates queue and stack into b(654)f amd t(123)b respectively
    s.push(q.dequeue());
  }
  
  
  // Flipping the queue half
  while (!q.isEmpty()) {
    s.push(q.dequeue());
  }
  while (!s.isEmpty()) {
    q.enqueue(s.pop());
  }
  
  // Flips it again (necessary to flip again bc of middle case for odds)
  for (int i = 0; i < size / 2; i++) {
    s.push(q.dequeue());
  }
  for (int i = 0; i < size / 2; i++) {
    q.enqueue(s.pop());
  }

  // Upside down, so I just un-upside down it
  while (!q.isEmpty()) {
    s.push(q.dequeue());
  }
  while (!s.isEmpty()) {
    q.enqueue(s.pop());
  }  
  return flag;
}