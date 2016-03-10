public boolean hasPathSum(int n) {
	return this.hasPathSum(this.overallRoot, n, 0);
}

private boolean hasPathSum(IntTreeNode root, int target, int sum) {
	if (root == null) {
		return false;
	}
	sum += root.data;
	if (sum == target) {
		return true;
	} else {
		return this.hasPathSum(root.left, target, sum) || this.hasPathSum(root.left, target, sum);
	}
}
