public void removeRightLeaves() {
	this.overallRoot = this.removeRightLeaves(this.overallRoot, false);
}

private IntTreeNode removeRightLeaves(IntTreeNode root, boolean isRight) {
	if (root != null) {
		root.left = this.removeRightLeaves(root.left, false);
		root.right = this.removeRightLeaves(root.right, true);
		if (root.left == null && root.right == null && isRight) {
			root = null;
		}
	}
}