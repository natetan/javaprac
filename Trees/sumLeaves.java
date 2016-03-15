public int sumLeaves() {
    return this.sumLeaves(this.overallRoot, 0);
}

private int sumLeaves(IntTreeNode root, int sum) {
    if (root == null) {
        return 0;
    } else if (root.left == null && root.right == null) {
        sum += root.data;
    } else {
        return this.sumLeaves(root.left) + this.sumLeaves(root.right);
    }
}
