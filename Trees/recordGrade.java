public static void recordGrade(Map<String, Map<String, Double>> map, String id, double grade, String co) {
	// {1234={"cse142"=3.4, "engl111"=2.5}, 4321={"phys121"=3.0}}
	// recordGrade(grades, "3333", 3.4, "arch150");
	if (!map.containsKey(id)) {
		map.put(id, new TreeMap<String, Double>());
		map.get(id).put(co, grade);
	} else { // has id
		if (grade > map.get(id).get(co)) {
			map.get(id).put(co, grade);
		}
	}
}
