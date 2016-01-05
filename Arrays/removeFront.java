public void removeFront(int n) {
    for (int i = 0; i < this.size; i++) {
        elementData[i] = elementData[i + n];
    }
    this.size -= n;
}