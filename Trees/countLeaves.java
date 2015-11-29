public int countLeaves() {
    return this.countLeaves(this.overallRoot);
}

private int countLeaves(IntTreeNode current) {
    if (current == null) {
        return 0;
    } else if (current.left == null && current.right == null) {
        return 1 + this.countLeaves(current.left) + this.countLeaves(current.right);
    } else {
        return this.countLeaves(current.left) + this.countLeaves(current.right);
    }
}