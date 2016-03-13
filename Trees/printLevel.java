public void printLevel(int target) {
    if (target < 1) {
        throw new IllegalArgumentException();
    }
    this.printLevel(this.overallRoot, target, 1);
}

private void printLevel(IntTreeNode root, int target, int level) {
    if (root != null) {
        if (target != level) {
            this.printLevel(root.left, target, level + 1);
            this.printLevel(root.right, target, level + 1);
        } else {
            System.out.println(root.data);
        }
    }
}
