public int matches(IntTree t2) {
	return this.matches(this.overallRoot, t2.overallRoot);
}

private int matches(IntTreeNode root1, IntTreeNode root2) {
	if (root1 == null || root2 == null) {
		return 0;
	} else if (root1.data == root2.data) {
		return 1 + this.matches(root1.left, root2.left) + this.matches(root1.right, root2.right);
	} else {
		return this.matches(root1.left, root2.left) + this.matches(root2.left, root2.right);
	}
}
