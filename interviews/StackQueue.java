/*
 * Implement a Queue using 2 stacks
 * 
 * Using integers as the data
 */

import java.util.Stack;

public class Queue {
	private Stack<Integer> storage;
	private Stack<Integer> backup;
	private int count;

	public Queue() {
		this.storage = new Stack<Integer>();
		this.backup = new Stack<Integer>();
		this.count = 0;
	}

	public void add(int n) {
		this.storage.push(n);
		this.count++;
	}

	public int remove() {
		if (this.isEmpty()) {
			throw new NoSuchElementException();
		}
		int num = 0;
		while (!this.storage.isEmpty()) {
			this.backup.push(this.storage.pop());
		}
		num = this.backup.pop();
		while (!this.backup.isEmpty()) {
			this.storage.push(this.backup.pop());
		}
		this.count--;
		return num;
	}

	public int size() {
		return this.count;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public int peek() {
		if (this.isEmpty()) {
			throw new NoSuchElementException();
		}
		while (!this.storage.isEmpty()) {
			this.backup.push(this.storage.pop());
		}
		int num = this.backup.pop();
		this.backup.push(this.backup.pop());
		while (!this.backup.isEmpty()) {
			this.storage.push(this.s2.pop());
		}
		return num;
	}
			
}
