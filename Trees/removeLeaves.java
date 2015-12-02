public void removeLeaves() {
    this.overallRoot = this.removeLeaves(this.overallRoot);
}

private IntTreeNode removeLeaves(IntTreeNode current) {
    if (current != null) {
        if (current.left == null && current.right == null) {
            current = null;
        } else {
            current.left = this.removeLeaves(current.left);
            current.right = this.removeLeaves(current.right);
        }
    }
    return current;
}