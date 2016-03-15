public int oddPathSum() {
	return help(overallRoot, 0);
}

private int help(IntTreeNode root, int sum) {
	if (root == null) {
		return 0;
	} 
	sum += root.data;
	if (sum % 2 == 1) {
		return 1 + help(root.left) + help(root.right);
	} else {
		return help(root.left) + help(root.right);
	}
}
