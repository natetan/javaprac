public void limitLeaves(int n) {
	this.overallRoot = this.limitLeaves(this.overallRoot, n);
}

private IntTreeNode limitLeaves(IntTreeNode root, int n) {
	if (root != null) {
		root.left = this.limitLeaves(root.left, n);
		root.right = this.limitLeaves(root.right, n);
		if (root.left == null && root.right == null && root.data <= n) {
			root = null;
		}
	}
	return root;
}
