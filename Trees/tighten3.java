public void tighten() {
	overallRoot = tighten(overallRoot);
}

private IntTreeNode tighten(IntTreeNode root) {
	if (root != null) {
		root.left = tighten(root.left);
		root.right = tighten(root.right);
		if (root.left != null && root.right == null) {
			root = root.left;
		} else if (root.left == null && root.right != null) {
			root = root.right;
		}
	}
	return root;
}
