public String toString() {
	return this.toString(this.overallRoot);
}

private String toString(IntTreeNode root) {
	if (root == null) {
		return "empty";
	} else {
		if (root.left == null && root.right == null) {
			return root.data + "";
		} else {
			return "(" + root.data + ", " + this.toString(root.left) + ", " + this.toString(root.right) + ")";
		}
	}
}
