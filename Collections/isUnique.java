public boolean isUnique(Map<String, String> map) {
	Set<String> values = new HashSet<String>();
	for (String value : map.values()) {
		if (values.contains(value)) {
			return false;
		} else {
			values.add(value);
		}
	}
	return true;
}