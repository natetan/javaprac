public static String moveToEnd(String s, char c) {
	if (s.length() == 0) {
		return "";
	}  
	String first = s.substring(0,1);
	if (first.equals(c + "")) {
		return moveToEnd(s.substring(1), c) + first;
	} else {
		return first + moveToEnd(s.substring(1), c);
	}
}