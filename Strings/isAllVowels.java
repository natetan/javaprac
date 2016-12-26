public static boolean isAllVowels(String s) {
  s = s.toLowerCase();
  String vowels = "aeiou";
  for (int i = 0; i < s.length(); i++) {
    if (!vowels.contains(s.charAt(i) + "")) {
      return false;
    }
  }
  return true;
}