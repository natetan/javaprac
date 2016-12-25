public static boolean isPangram(String s) {
  s = s.toLowerCase();
  String alphabet = "ancdefghijklmnopqrstuvwxyz";
  for (int i = 0; i < alphabet.length(); i++) {
    if (!s.contains(alphabet.charAt(i) + "")) {
      return false;
    }
  }
  return true;
}