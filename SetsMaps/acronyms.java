public Map<String, Set<List<String>> acronyms(Set<List<String>> lists) {
	Map<String, Set<List<String>> map = new TreeMap<String, Set<List<String>>();
	for (List<String> list : lists) {
		String acronym = this.acronymFor(list);
		if (!map.containsKey(acronym)) {
			map.put(acronym, new Set<List<String>>());
		}
		map.get(acronym).add(list);
	}
	return map;
}
