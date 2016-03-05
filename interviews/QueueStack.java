/*
 *	Implement a Stack using 2 Queues
 *  why did we even need 2 queues? 1 worked fine	
 *
 *	Integer will be used for the data
 *	
 *	The back of the queue will be considered the TOP of the stack.
 */

public class QueueStack {
	private Queue<Integer> storage;
	private Queue<Integer> backup;
	private int count;

	// Constructs a new QueueStack
	public QueueStack() {
		this.storage = new LinkedList<Integer>();
		this.backup = new LinkedList<Integer>();
		this.count = 0;
	}

	// Stores the given int into the Stack
	public void push(int n) {
		this.storage.add(n);
		this.count++;
	}

	// Removes the element from the TOP of the stack (back of the queue)
	// and returns it
	public int pop() {
		this.shift();	
		int num = this.storage.remove();
		this.count--;
		return num;
	}

	// Returns the int at the top of the stack without changing the order
	// of the elements
	public int peek() {
		this.shift();
		int num = this.storage.remove();
		this.storage.add(num);
		return num;
	}

	// Returns the stack's size
	public int size() {
		return this.count;
	}

	// Returns true if the stack is empty and false otherwise
	public boolean isEmpty() {
		return this.size() == 0;
	}

	// Rotates the queue so the last element is at the front.
	// Throws a NoSuchElementException if it is empty
	private void shift() {
		if (this.isEmpty()) {
			throw new NoSuchElementException();
		}
		int size = this.storage.size();
		for (int i = 0; i < size - 1; i++) {
			this.storage.add(this.storage.remove());
		}
	}
}
