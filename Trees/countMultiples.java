public int countMultiples(int n) {
	return this.countMultiples(this.overallROot, n);
}

private int countMultiples(IntTreeNode root, int n) {
	if (root == null) {
		return 0;
	} else if (root.data % n == 0) {
		return 1 + this.countMultiples(root.left, n) + this.countMultiples(root.right, n);
	} else {
		return this.countMultiples(root.left, n) + this.countMultiples(root.right, n);
	}
}
