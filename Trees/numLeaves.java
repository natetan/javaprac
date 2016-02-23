public int numLeaves() {
	return this.numLeaves(this.overallRoot);
}

private int numLeaves(IntTreeNode node) {
	if (node == null) {
		return 0;
	} else if (node.left == null && node.right == null) {
		return 1 + this.numLeaves(node.left) + this.numLeaves(node.right);
	} else {
		return this.numLeaves(node.left) + this.numLeaves(node.right);
	}
}
