// Remove all Strings with length in range of min and max

public static void removeRange(Set<String> set, int min, int max) {
	if (min > max || min < 0 || max < 0) {
		throw new IllegalArgumentException();
	}
	Iterator i = set.iterator();
	while (i.hasNext()) {
		int n = i.next().length();
		if (n < min || n > max) {
			i.remove();
		}
	}
}
