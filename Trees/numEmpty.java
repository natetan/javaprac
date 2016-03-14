public int numEmpty() {
	return this.numEmpty(this.overallRoot);
}

private int numEmpty(IntTreeNode root) {
	if (root == null) {
		return 1;
	} else if (root.left == null && root.right == null) {
		return 2;
	} else if (root.left == null && root.right != null) {
		return 1 + this.numEmpty(root.right);
	} else {
		return 1 + this.numEmpty(root.left);
	}
}
