public int numNodes() {
	return this.numNodes(this.overallRoot);
}

private int numNodes(IntTreeNode node) {
	if (node == null) {
		return 0;
	} else {
		return 1 + this.numNodes(node.left) + this.numNodes(node.right);
	}
}
