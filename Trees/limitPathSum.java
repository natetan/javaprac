public void limitPathSum(int n) {
	this.overallRoot = this.limitPathSum(this.overallRoot, max, 0);
}

private IntTreeNode limitPathSum(IntTreeNode root, int max, int n) {
	if (root != null) {
		if (n > max) {
			root = null;
		} else {
			root.left = this.limitPathSum(root.left, max, n + root.data);
			root.right = this.limitPathSum(root.right, max, n + root.data);
		}
	}
	return root;
}
