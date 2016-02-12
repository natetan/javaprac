public void removeLast(int n) {
	int index = 0;
	boolean contains = false;
	for (int i = 0; i < this.size; i++) {
		if (elementData[i] == n) {
			index = i;
			contains = true;
		}
	}

	if (contains) {
		for (int i = 0; i < this.size - 1; i++) {
			if (index == i) {
				elementData[i] = elementData[i + 1];
			}
		}
		this.size--;
	}
}