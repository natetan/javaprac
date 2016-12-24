public void removeOddPositions() {
	if (this.size == 2) {
		this.size = 1;
	} else {
		for (int i = 0; i < this.size; i++) {
			if (i * 2 <= this.size) {
				elementData[i] = elementData[i * 2];
			}
		}
		this.size -= this.size / 2;
	}
}