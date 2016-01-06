public void remove(int index) {
	for (int i = index; i < this.size - 1; i++) {
		int next = list[i + 1];
		list[i] = next;
	}
	this.size--;
}