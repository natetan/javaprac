public class ClockTime implements Comparable<ClockTime> {
	private int hours, minutes;
	private String amPm;

	public ClockTime(int hours, int minutes, String amPm) {
		this.hours = hours;
		this.minutes = minutes;
		this.amPm = amPm;
	}

	public int getHours() {
		return this.hours;
	}

	public int getMinutes() {
		return this.minutes;
	}

	public String getAmPm() {
		return this.amPm;
	}

	public String toString() {
		String mins = "";
		if (this.minutes < 10) {
			mins = "0";
		}
		return this.hours + ":" + mins + this.minutes + " " + this.amPm;
	}

	public int compareTo(ClockTime other) {
		if (!this.amPm.equals(other.amPm)) {
			return this.amPm.compareTo(other.amPm);
		} else {
			// at this point, we know the amPm matches
			if (this.hours == other.hours) {
				return this.minutes - other.minutes;
			} else {
				return this.hours % 12 - other.hours % 12;
			}
		}
	}
}

