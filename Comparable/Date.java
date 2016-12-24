public int compareTo(CalendarDate other) {
	if (this.year != other.year) {
		return ((Integer)this.year).compareTo(other.year);
	} else if (this.month != other.month) {
		return ((Integer)this.month).compareTo(other.month);
	} else {
		return ((Integer)this.day).compareTo(other.day);
	}
}