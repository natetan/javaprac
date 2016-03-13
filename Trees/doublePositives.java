public void doublePositives() {
	this.doublePositives(this.overallRoot);
}

private void doublePositives(IntTreeNode root) {
	if (root != null) {
		if (root.data > 0) {
			root.data *= 2;
		}
		this.doublePositives(root.left);
		this.doublePositives(root.right);
	}
}
