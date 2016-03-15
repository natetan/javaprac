public boolean hasPath(int start, int end) {
	return this.hasPath(this.overallRoot, start, end, false);
}

private boolean hasPath(IntTreeNode root, int start, int end, boolean found) {
	if (root == null) {
		return false;
	} else if (root.data == start) {
		found = true;
		return this.hasPath(root.left, start, end, found) || this.hasPath(root.right, start, end, found);
	} else if (root.data == end && found) {
		return true;
	} else {
		return this.hasPath(root.left, start, end, found) || this.hasPath(root.right, start, end, found);
	}
}
