public void writeTree() {
	this.writeTree(this.overallRoot);
}

private void writeTree(IntTreeNode root) {
	if (root != null) {
		if (root.left == null && root.right == null) {
			System.out.println(0 + " " + root.data);
		} else if (root.left != null && root.right == null) {
			System.out.println(1 + " " + root.data);
		} else if (root.left == null && root.right != null) {
			System.out.println(2 + " " + root.data);
		} else {
			System.out.println(3 + " " + root.data);
		}
		this.writeTree(root.left);
		this.writeTree(root.right);
	}
}
