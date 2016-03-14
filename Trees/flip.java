public void flip() {
	this.overallRoot = this.flip(this.overallRoot);
}

private IntTreeNode flip(IntTreeNode root) {
	if (root != null) {
		IntTreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		root.left = this.flip(root.left);
		root.right = this.flip(root.right);
	}
	return root;
}


