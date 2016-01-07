public void add(int n) {
	this.add(this.size, n);	
}

public void add(int index, int n) {
	this.size++;
	for (int i = this.size - 1; i >= index; i--) {
		if (i != index) { // reached the place to 'add' n
			elementData[i] = elementData[i - 1];
		}
	}
	elementData[index] = n;
}