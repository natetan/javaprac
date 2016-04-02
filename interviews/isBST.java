public boolean isBST() {
	return this.isBST(this.overallRoot, Integer.MIN_VALUE, Integer.MAX_VALUE);
}

private boolean iSBST(IntTreeNode root, int min, int max) {
	if (root == null) {
		return true;
	} else if (root.data <= min || root.data >= max) {
		return false;
	} else {
		return this.isBST(root.left, min, root.data) && this.isBST(root.right, root.data, max);
	}
}
