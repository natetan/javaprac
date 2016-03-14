public int numberNodes() {
    return this.numberNodes(this.overallRoot, 1);
}

private int numberNodes(IntTreeNode root, int n) {
    if (root != null) {
        root.data = n;
        int left = this.numberNodes(root.left, n + 1);
        int right = this.numberNodes(root.right, n + left + 1);
		// returns total number of children + 1 for current
        return right + left + 1;
    } else {
        return 0;
    }
}
