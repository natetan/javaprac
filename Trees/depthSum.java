public int depthSum() {
	return this.depthSum(this.overallRoot, 1);
}

private int depthSum(IntTreeNode root, int level) {
	if (root == null) {
		return 0;
	} else {
		return level * root.data + this.depthSum(root.left, level + 1) + this.depthSum(root.right, level + 1);
	}
}
