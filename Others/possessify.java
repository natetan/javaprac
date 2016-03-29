public String possessify(String word) {
	if (word.endsWith("s")) {
		return word + "\'";
	} else {
		return word + "\'s";
	}
}
