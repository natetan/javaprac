public ArrayIntList runningTotal() {
	ArrayIntList list2 = new ArrayIntList();
	int sum = 0;
	for (int i = 0; i < this.size; i++) {
		sum += this.elementData[i];
		list2.elementData[i] = sum;
		list2.size++;
	}
	return list2;
}