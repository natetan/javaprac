public static boolean isReverse(String reg, String reverse) {
    if (reg.length() != reverse.length()) {
        return false;
    }
    if (reg.length() == 0 && reverse.length() == 0) {
        return true;
    }
    String s1 = (reg.charAt(0) + "").toLowerCase();
    String s2 = (reverse.charAt(reverse.length() - 1) + "").toLowerCase();
    if (!s1.equals(s2)) {
        return false;
    } else {
        return isReverse(reg.substring(1), reverse.substring(0, reverse.length() - 1));
    }
}