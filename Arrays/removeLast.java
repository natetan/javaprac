public void removeLast(int n) {
	int index = 0;
	boolean exists = false;
	for (int i = 0; i < this.size; i++) {
		if (elementData[i] == n) {
			index = i;
			exists = true;
		}
	}

	if (exists) {
		for (int i = 0; i < this.size - 1; i++) {
			if (index == i) {
				elementData[i] = elementData[i + 1];
			}
		}
		this.size--;
	}
}