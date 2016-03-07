public static String acronymFor(List<String> list) {
	String result = "";
	for (String s : list) {
		char c = s.charAt(0);
		if (c.isUpperCase()) {
			result += c;
		}
	}
	return result;
}
