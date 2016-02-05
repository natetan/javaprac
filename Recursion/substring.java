public static String substring(String s, int start, int end) {
    if (start < 0 || end > s.length() || end < start) {
        throw new IllegalArgumentException();
    }
    return substring(s, start, end, 0);
}

public static String substring(String s, int start, int end, int place) {
    if (start == end) {
        return "";
    } else {
        if (start == place) {
            return s.charAt(place) + substring(s, start + 1, end, place + 1);
        } else {
            return substring(s, start, end, place + 1);
        }
    }
}