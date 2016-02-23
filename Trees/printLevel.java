public void printLevel(int n) {
	this.printLevel(1, this.overallRoot, n);
}

private void printLevel(int level, IntTreeNode root, int target) {
	if (root != null && target != 0) {
		if (level != target) {
			this.printLevel(level + 1, root.left, target);
			this.printLevel(level + 1, root.right, target);
		} else {
			System.out.print(root.data);
		}
	}
}
