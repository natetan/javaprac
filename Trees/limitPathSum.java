public void limitPathSum(int n) {
	this.overallRoot = this.limitPathSum(this.overallRoot, n, 0);
}

private IntTreeNode limitPathSum(IntTreeNode root, int max, int sum) {
	if (root != null) {
        sum += root.data;
		if (sum > max) {
			root = null;
		} else {
			root.left = this.limitPathSum(root.left, max, sum);
			root.right = this.limitPathSum(root.right, max, sum);
		}
	}
	return root;
}