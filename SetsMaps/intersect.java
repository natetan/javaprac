public static Map<String, Integer> intersect(Map<String, Integer> m1, Map<String, Integer> m2) {
    Map<String, Integer> m3 = new HashMap<String, Integer>();
    for (String item : m1.keySet()) {
        if (m2.containsKey(item) && m2.containsValue(m1.get(item))) {
            m3.put(item, m1.get(item));
        }
    }
    return m3;
}