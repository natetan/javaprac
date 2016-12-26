public static int digitSum(int n) {
  if (n < 0) {
    return digitSum(-n);
  } else if (n < 10) {
    return n;
  } else {
    return n % 10 + digitSum(n / 10);
  }
}