public static boolean isUnique(int[] list) {
	boolean flag = true;
	if (list.length < 2) {
		return true;
	}
	Set<Integer> set = new HashSet<Integer>();
	for (int i = 0; i < list.length; i++) {
		if(set.contains(list[i])) {
			flag = false;
		} else {
			set.add(list[i]);
		}
	}
	return flag;
}