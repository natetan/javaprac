public class TeamData implements Comparable<TeamData> {

	private String name;
	private int problems, count, minutes;

	public TeamData(String name, int problems) {
		this.name = name;
		this.problems = problems;
	}

	public void success(int problem, int time) {
		this.count++;
		this.minutes += time;
	}

	public int solved() {
		return this.count;
	}

	public int time() {
		return this.minutes;
	}

	public double percentCorrect() {
		return Math.floor((this.count / this.problems) / 10) * 10;
	}

	public String toString() {
		return this.name + " solved " + this.count + " of " + this.problems + " in " + this.minutes + " minutes";
	}

	public int compareTo(TeamData other) {
		if (this.count == other.count) {
			return this.minutes - other.minutes;
		} else {
			return this.count - other.count;
		}
	}
}

