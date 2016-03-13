public int size() {
    return this.size(this.overallRoot);
}

private int size(IntTreeNode root) {
    if (root == null ) {
        return 0;
    } else {
        return 1 + this.size(root.left) + this.size(root.right);
    }
}
