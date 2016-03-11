public static String acronymFor(List<String> list) {
	String result = "";
	for (String s : list) {
		result += Character.toUpperCase(s.charAt(0));
	}
	return result;
}
