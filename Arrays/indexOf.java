public static int indexOf(int[] list, int num) {
	for (int i = 0; i < list.length; i++) {
		if (list[i] == num) {
			return i;
		}
	}
	return -1;
}