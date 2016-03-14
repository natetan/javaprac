public int purebredOdds() {
	return this.purebredOdds(this.overallRoot);
}

private int prebredOdds(IntTreeNode root) {
	if (root == null) {
		return 0;
	} else if (root.data % 2 == 0) {
		return 0;
	} else {
		return 1 + this.purebredOdds(root.left) + this.purebredOdds(root.right);
	}
}
