public int countEvenBranches() {
	return this.countEvenBranches(this.overallRoot);
}

private int countEvenBranches(IntTreeNode root) {
	if (root == null) {
		return 0;
	} else if (!this.isLeaf(root) && root.data % 2 == 0) {
		return 1 + this.countEvenBranches(root.left) + this.countEvenBranches(root.right);
	} else {
		return this.countEvenBranches(root.left) + this.countEvenBranches(root.right);
	}
}

private boolean isLeaf(IntTreeNode root) {
	return root.left == null && root.right == null;
}
