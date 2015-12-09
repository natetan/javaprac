public static int rarestAge(Map<String, Integer> m) {
    if (m == null || m.size() == 0) {
        throw new IllegalArgumentException();
    }
    Map<Integer, Integer> newMap = new TreeMap<Integer, Integer>();
    for (int age : m.values()) {
        if (newMap.containsKey(age)) {
            newMap.put(age, newMap.get(age) + 1);
        } else {
            newMap.put(age, 1);
        }
    }
    int min = Integer.MAX_VALUE;
    int rarest = 0;
    for (int age : newMap.keySet()) {
        if (newMap.get(age) < min) {
            min = Math.min(newMap.get(age), min);
            rarest = age;
        }
    }
    return rarest;
}