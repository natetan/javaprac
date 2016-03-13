public void printLeaves() {
	if (this.overallRoot == null) {
		System.out.print("no leaves");
	} else {
		System.out.print("leaves: ");
		this.printLeaves(this.overallRoot);
	}
}

private void printLeaves(IntTreeNode root) {
	if (root != null) {
		this.printLeaves(root.right);
		this.printLeaves(root.left);
		if (root.left == null && root.right == null) {
			System.out.print(root.data + " ");
		}
	}
}
