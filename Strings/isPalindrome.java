public static boolean isPalindrome(String s) {
  s = s.toLowerCase();
  if (s.length() < 2) {
    return true;
  } else if (s.charAt(0) != s.charAt(s.length() - 1)) {
    return false;
  } else {
    return isPalindrome(s.substring(1, s.length() - 1));
  }
}