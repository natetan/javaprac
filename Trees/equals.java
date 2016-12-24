public boolean equals(IntTree t2) {
  return this.equals(this.overallRoot, t2.overallRoot);
}

private boolean equals(IntTreeNode root1, IntTreeNode root2) {
  if (root1 == null && root2 == null) {
    return true;
  } else if (root1 == null || root2 == null) {
    return false;
  } else if (root1.data != root2.data) {
    return false;
  } else {
    return this.equals(root1.left, root2.left) && this.equals(root1.right, root2.right);
  }
}
