public int evenBranches() {
    return help(this.overallRoot);
}

private int help(IntTreeNode root) {
    if (root == null) {
        return 0;
    } else if ((root.left != null || root.right != null) && root.data % 2 == 0) {
        return 1 + help(root.left) + help(root.right);
    } else {
        return help(root.left) + help(root.right);
    }
}