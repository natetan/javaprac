// practice 2
// practice 18 08sp
public void interleave(Queue<Integer> q) {
	if(q.size() % 2 == 1) {
		throw new IllegalArgumentException();
		}  // after this point, we are guaranteed queue is even size
		Stack<Integer> s = new ArrayStack<Integer>();
		int size = q.size(); // temp for appropriate bounds
		q2s(q,s);            // moves ALL contents to stack, contents reversed 
		for(int i = 0; i < size / 2; i++) {     // reversed queue, add back HALF to queue
			q.add(s.pop());
		}                   // after this for loop, S.size = q.size, guaranteed

	// the example given says consider 
	// Consider the two halves of this list:
	//
	//         first half:  [1, 2, 3, 4, 5]    second half: [6, 7, 8, 9, 10]
	// These are combined in an alternating fashion to form a sequence of interleave pairs:
	// the first values from each half (1 and 6), then the second values from each half (2 and 7),
	// then the third values from each half (3 and 8), and so on.
	// In each pair, the value from the first half appears before the value from the second half.
	// Thus, after the call, the queue stores the following values:
	//
	//         front [1, 6, 2, 7, 3, 8, 4, 9, 5, 10] back
	// ^ this was actually in the spec, very strong hint 
	//
	// The spec strongly suggests that you should somehow split the contents 
	// then realize that the first item of the first half should come right before the
	// first item of the second half
	// If you try to do what the spec suggests, splitting into two, you will
	// see now that the only reasonable way to achieve desired result is to put in
	// one part from one half and the corresponding part from the other half and repeating
	//
	// DISCLAIMER: I set up the stacks and queues reversed relative to the specs description,
	// and from this point forward, it will be solved relative to being reversed, but the idea stands true
	//
	// We now have half in queue, half in stack
	// What we want is sort of  first half, second half, first half, repeat.
	// At this point, we have something like f[10, 9, 8, 7, 6]b  t[5, 4, 3, 2, 1]bot
	// The way I ordered my stack and queue (reversed relative to spec) shouldnt matter,
	// but we can see now that I would want my queue (since its reversed) to be
	// f[10, 5, 9, 4, 8, 3, 7, 2, 6, 1]b
	// Seeing that we have the first in each being 10 and 5 respectively and then 9 and 4, 
	// this closely follows the desired queue (which is reversed, but we fix later)
	// We see that the first of Queue gets added in, and then the first of Stack is added in.
	// The bounds of this would be exactly until all elements are interleaved, that is, while !s.empty
	while(!s.isEmpty()) {
		q.add(q.remove());
		q.add(s.pop());
	}
	// at this point, we have the desired queue, in reversed order. the next two fix it.
	q2s(q,s);
	s2q(s,q);
}



// This was my first attempt at the solution, when I still thought we had to use ArrayStack
// This solution more closely follows the spec 
public void interleave(Queue<Integer> q) {
	if(q.size() % 2 == 1) {
			throw new IllegalArgumentException();
	} // after this point, guaranteed queue is even size
	Stack<Integer> s = new ArrayStack<Integer>();
	while(!q.isEmpty()) {
		s.push(q.dequeue());
	}
	while(!s.isEmpty()) {
		q.enqueue(s.pop());
	}
	while(!q.isEmpty()) {
		s.push(q.dequeue());
	} // all contents are in original order top-bot inside of stack
	// t[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]b
	int times = s.size(); // temp for correct bounds
	for(int i = 0; i < times / 2; i++) { // we are splitting by two, so we only iterate 1/2 times
		q.enqueue(s.pop());
	} // after this point, we have queue f[1, 2, 3, 4, 5]b stack t[6, 7, 8, 9, 10]b
	// This closely recreates the process described by the spec. 
	// We can just follow along at this point. The spec says 1 should be right next to 6
	// 2 should be right next to 7
	// 3 next to 8
	// We can see from here that we simply add 1 to the back and add 6 to the back of the queue
	// then we add 2 to the back of the queue and 7 to the back of the queue
	// then we add 3 back and 8 back
	// etc. This can be summarized as
	//  q.add(q.remove());
	//  q.add(s.pop());
	// And we only want to do this until all are interleaved, which is while !s.empty
	while(!s.isEmpty()) {
		q.enqueue(q.dequeue());
		q.enqueue(s.pop());
	}
	// at this point, interleaved, correct orientation
}
