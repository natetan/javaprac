public static Set<Point> removeDuplicates(List<Point> list) {
	Set<Point> set = new HashSet<Point>();
	Iterator<Point> i = list.iterator();
	while (i.hasNext()) {
		Point p = i.next();
		if (!set.contains(p)) {
			set.add(p);
		} else {
			i.remove();
		}
	}
	return set;
}
