public static int vowelCount(String s) {
  String vowels = "aeiou";
  int count = 0;
  for (int i = 0; i < s.length; i++) {
    if (vowels.contains(s.charAt(i) + "")) {
      count++;
    }
  }
  return count;
}