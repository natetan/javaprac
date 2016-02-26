public void readTree(Scanner input) {
	this.overallRoot = this.buildTree(input);
}

private IntTreeNode buildTree(Scanner input) {
	int type = input.nextInt();
	int data = input.nextInt();
	IntTreeNode root = new IntTreeNode(data);
	if (type == 1 || type == 3) {
		root.left = this.buildTree(input);
	}
	if (type == 2 || type == 3) {
		root.right = this.buildTree(input);
	}
	return root;
}
