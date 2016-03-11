public static boolean contains3(List<String> list) {
    Map<String, Integer> storage = new HashMap<String, Integer>();
    int max = 0;
    for (String word : list) {
        if (storage.containsKey(word)) {
            storage.put(word, storage.get(word) + 1);
        } else {
            storage.put(word, 1);
        }
    }
    for (Integer num : storage.values()) {
        max = Math.max(num, max);
    }
    return max >= 3;
}