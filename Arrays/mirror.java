public void mirror() {
    this.size *= 2;
    for (int i = 0; i < this.size / 2; i++) {
        elementData[this.size - i - 1] = elementData[i];
    }
}