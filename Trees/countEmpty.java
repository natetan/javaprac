public int countEmpty() {
	return this.countEmpty(this.overallRoot);
}

private int countEmpty(IntTreeNode root) {
	if (root == null) {
		return 1;
	} else {
		return this.countEmpty(root.left) + this.countEmpty(root.right);
	}
}
