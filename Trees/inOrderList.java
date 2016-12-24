public List<Integer> inOrderList() {
  return this.inOrderList(this.overallRoot, new ArrayList<Integer>());
}

private List<Integer> inOrderList(IntTreeNode root, List<Integer> list) {
  if (root != null) {
    this.inOrderList(root.left, list);
    list.add(root.data);
    this.inOrderList(root.right, list);
  }
  return list;
}
