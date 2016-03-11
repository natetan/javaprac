public void makeFull() {
	this.overallRoot = this.makeFull(this.overallRoot, -1);
}

private IntTreeNode makeFull(IntTreeNode root, int level) {
	if (root != null) {
		if (root.left == null && root.right != null || root.left != null && root.right == null) {
			root = new IntTreeNode(level, root.left, root);
			root.left = this.makeFull(root.left, level - 1);
			root.right = this.makeFull(root.right, level - 1);
		}
	}
	return root;
}
