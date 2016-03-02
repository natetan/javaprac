public void completeToLevel(int n) {
    if (n < 1) {
        throw new IllegalArgumentException();
    }
    this.overallRoot = this.completeToLevel(this.overallRoot, n, 1);
}

private IntTreeNode completeToLevel(IntTreeNode root, int target, int level) {
    if (level <= target) {
        if (root == null) {
            root = new IntTreeNode(-1);
        }
        root.left = this.completeToLevel(root.left, target, level + 1);
        root.right = this.completeToLevel(root.right, target, level + 1);
    }
    return root;
}