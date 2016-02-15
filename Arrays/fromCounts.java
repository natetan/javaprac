public ArrayIntList fromCounts() {
	ArrayIntList list2 = new ArrayIntList();
	int index = 0;
	for (int i = 0; i < this.size; i += 2) {
		for (int j = 0; j < this.elementData[i]; j++) {
			list2.elementData[index] = this.elementData[i + 1];
			index++;
		}
	}
	list2.size = index;
	return list2;
}