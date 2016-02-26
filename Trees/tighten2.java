public void tighten() {
	this.overallRoot = this.tighten(this.overallRoot);
}

private IntTreeNode tighten(IntTreeNode root) {
	if (root != null) {
		root.left = this.tighten(root.left);
		root.right = this.tighten(root.right);
		if (root.left == null && root.right != null) {
			root = root.right;
		} else if (root.left != null && root.right == null) {
			root = root.left;
		}
	}
	return root;
}
