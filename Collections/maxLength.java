public int maxLength(Set<String> set) {
    int max = 0;
    for (String word : set) {
        if (word.length() > max) {
            max = word.length();
        }
    }
    return max;
}