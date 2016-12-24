public static int indexOf(String s1, String s2) {
	if (s2.length() > s1.length()) {
		return -1;
		// not necessary check. handled by recursive case
	} else if (s1.equals(s2)) {
		return 0;
	} else { // s1 is longer than or equal to s2 
		if (!s1.substring(0, s2.length()).equals(s2)) {
			int num = indexOf(s1.substring(1), s2);
			if (num == -1) {
				return -1;
			} else {
				return 1 + num;
			}
		} else {
			// s1 starts with s2
			return 0;
		}
	}
}