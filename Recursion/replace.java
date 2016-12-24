public static String replace(String s, char first, char second) {
	if (s.length() == 0) {
		return "";
	} else if (first == second) {
		return s;
	} else {
		if (s.charAt(0) == first) {
			return second + replace(s.substring(1), first, second);
		} else {
			return s.charAt(0) + replace(s.substring(1), first, second);
		}
	}
}