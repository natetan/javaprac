public void removeAll(int n) {
	for (int i = 0; i < this.size; i++) {
		if (this.elementData[i] == n) {
			this.remove(i);
			i--;
		}
	}
}