public void removeRange(int start, int stop) {
	if (start > end || start > this.size || stop > this.size) {
		throw new IllegalArgumentException();
	}
	if (this.size > 0) {
		int count = 0;
		for (int i = start; i < stop; i++) {
			this.elementData[i] = this.elementData[stop + count];
			count++;
		}
	}
	this.size -= (stop - start);
}

