public void evenLevels() {
  this.overallRoot = this.evenLevels(this.overallRoot, 1);
}

private IntTreeNode evenLevels(IntTreeNode root, int level) {
  if (root != null) {
    if (root.left == null && root.right == null && level % 2 == 1) {
      root = null;
    } else {
      root.left = this.evenLevels(root.left, level + 1);
      root.right = this.evenLevels(root.right, level + 1);
    }
  }
  return root;
}
