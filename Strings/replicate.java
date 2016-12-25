public static String replicate(String s) {
  replicate(s, 2);
}

public static String replicate(String s, int times) {
  if (times == 0) {
    return "";
  } else {
    return s + replicate(s, times - 1);
  }
}