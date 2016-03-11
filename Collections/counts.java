public static Map<Integer, Integer> counts(List<Integer> list, Set<Integer> set) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int key : list) {
        if (set.contains(key)) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
    }
    return map;
}