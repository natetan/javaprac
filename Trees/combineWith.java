public IntTree combineWith(IntTree t2) {
	IntTree t3 = new IntTree();
	t3.overallRoot = this.combineWith(this.overallRoot, t2.overallRoot, t3.overallRoot);
}

private IntTreeNode combineWith(IntTreeNode root1, IntTreeNode root2, IntTreeNode root3) {
	if (root1 != null && root2 == null) {
		root3 = new IntTreeNode(1);
		root3.left = this.combineWith(root1.left, null, root3.left);
		root3.right = this.combineWith(root1.right, null, root3.right);
	} else if (root1 == null && root2 != null) {
		root3 = new IntTreeNode(2);
		root3.left = this.combineWith(null, root2.left, root3.left);
		root3.right = this.combineWith(null, root.right, root3.right);
	} else if (root1 != null && root2 != null) {
		root3 = new IntTreeNode(3);
		root3.left = this.combineWith(root1.left, root2.left, root3.left);
		root3.right = this.combineWith(root1.right, root2.right, root3.right);
	} else {
		// do nothing	
	}
	return root3;
}

