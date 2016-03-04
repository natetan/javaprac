/*
 *	Implement a Stack using 2 Queues
 *  why did we even need 2 queues? 1 worked fine	
 *
 *	Integer will be used for the data
 */

public class QueueStack {
	private Queue<Integer> storage;
	private Queue<Integer> backup;
	private int count;

	public QueueStack() {
		this.storage = new LinkedList<Integer>();
		this.backup = new LinkedList<Integer>();
		this.count = 0;
	}

	public void push(int n) {
		this.storage.add(n);
		this.count++;
	}

	public int pop() {
		this.shift();	
		int num = this.storage.remove();
		this.count--;
		return num;
	}

	public int peek() {
		this.shift();
		int num = this.storage.remove();
		this.storage.add(num);
		return num;
	}

	public int size() {
		return this.count;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

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
