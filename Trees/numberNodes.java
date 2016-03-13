public int numberNodes() {
    return this.numberNodes(this.overallRoot, 1);
}

private int numberNodes(IntTreeNode root, int n) {
    if (root != null) {
        root.data = n;
        int left = this.numberNodes(root.left, n + 1);
        int right = this.numberNodes(root.right, n + left + 1);
        return right + left + 1;
    } else {
        return 0;
    }
}
