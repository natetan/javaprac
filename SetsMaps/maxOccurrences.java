public static int maxOccurrences(List<Integer> list) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int num : list) {
        if (map.containsKey(num)) {
            map.put(num, map.get(num) + 1);
        } else {
            map.put(num, 1);
        }
    }
    int max = 0;
    for (int num : map.values()) {
        max = Math.max(num, max);
    }
    return max;
}