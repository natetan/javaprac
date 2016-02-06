public static String substring(String s, int start, int end) {
    if (start < 0 || end > s.length() || start > end) {
        throw new IllegalArgumentException();
    }
    if (start == end) {
        return "";
    } else {
        return s.charAt(start) + substring(s, start + 1, end);
    }
}