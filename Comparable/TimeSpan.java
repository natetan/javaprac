public class TimeSpan implements Comparable<TimeSpan> {
	private int hours, minutes, seconds

	public TimeSpan(int hours, int minutes, int seconds) {
		if (hours < 0 || minutes < 0 || seconds < 0) {
			throw new IllegalArgumentException();
		}
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public int hours() {
		return this.hours;
	}

	public int minutes() {
		return this.minutes;
	}

	public int seconds() {
		return this.seconds;
	}

	public int totalSeconds() {
		return this.hours * 60 * 60 + this.minutes * 60 + this.seconds;
	}

	public TimeSpan add(TimeSpan other) {
		return new TimeSpan(this.hours + other.hours, this.minutes + other.minutes, this.seconds + other.seconds);
	}

	public String toString() {
		while (this.seconds > 59) {
			this.minutes += 1;
			this.seconds -= 60;
		}
		while (this.minutes > 59) {
			this.hours += 1;
			this.minutes -= 60;
		}
		String mins = "";
		String secs = "";
		if (this.minutes < 10) {
			mins += "0";
		}
		if (this.seconds < 10) {
			secs += "0";
		}
		return this.hours + ":" + mins + this.minutes + ":" + secs + this.seconds;
	}

	public int compareTo(TimeSpan other) {
		return this.totalSeconds() - other.totalSeconds();
	}
}

