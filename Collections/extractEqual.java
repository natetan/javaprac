public static Set<Point> extractAll(Set<Point> set) {
	Set<Point> newSet = new HashSet<Point>();
	for (Point p : set) {
		if (p.getX() == p.getY()) {
			newSet.add(p);
		}
	}
	return newSet;
}
