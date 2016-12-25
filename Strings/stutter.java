public static String stutter(String s) {
  String result = "";
  for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);
    result += c + c;
  }
  return result;
}