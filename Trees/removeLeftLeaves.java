public void removeLeftLeaves() {
	this.overallRoot = this.removeLeftLeaves(this.overallRoot, false);
}

private IntTreeNode removeLeftLeaves(IntTreeNode root, boolean isLeft) {
	if (root != null) {
		root.left = this.removeLeftLeaves(root.left, true);
		root.right = this.removeLeftLeaves(root.right, false);
		if (root.left == null && root.right == null && isLeft) {
			root = null;
		}
	}
	return root;
}
