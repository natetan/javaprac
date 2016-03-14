public int nodesAtLevels(int min, int max) {
	if (min < 0 || min > max) {
		throw new IllegalArgumentException();
	}
	return this.nodesAtlevels(this.overallRoot, min, max, 1);
}

private int nodesAtLevels(IntTreeNode root, int min, int max, int level) {
	if (root != null) {
		if (min < level) {
			return this.nodesAtLevels(root.left, min + 1, max, level) + this.nodesAtLevels(root.right, min + 1, max, level);
		} else {
			return 1 + this.nodesAtLevels(root.left, min + 1, max, level) + this.nodesAtLevels(root.right, min + 1, max, level);
		}
	} else {
		return 0;
	}
}

