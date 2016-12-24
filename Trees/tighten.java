public void tighten() {
	this.overallRoot = this.tighten(this.overallRoot);
}

private IntTreeNode tighten(IntTreeNode current) {
	if (current != null) {
		current.left = this.tighten(current.left);
		current.right = this.tighten(current.right);
		if (current.left != null && current.right == null) {
			current = current.left;
		} else if (current.left == null && current.right != null) {
			current = current.right;
		}
	}
	return current;
}