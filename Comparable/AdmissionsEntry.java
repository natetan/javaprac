public class AdmissionsEntry implements Comparable<AdmissionsEntry> {
	private String id;
	private double rating;
	public int count;
	public boolean hellaCool;

	public AdmissionsEntry(String id) {
		this.id = id;
		count = 0;
		rating = 0.0;
		hellaCool = false;
	}

	public String getID() {
		return this.id;
	}

	public void rate(double rating) {
		this.rating += rating;
		this.count++;
		if (rating >= 4.0) {
			hellaCool = true;
		}
	}

	public boolean flag() {
		return hellaCool;
	}

	public double getRating() {
		if (count == 0) {
			return 0.0;
		} else {
			return rating / count;
		}
	}

	public String toString() {
		double d = Math.round(getRating() * 100) / 100;
		return id + ":" + " " + d;
	}

	public int compareTo(AdmissionsEntry other) {
		if (this.flag() && other.flag()) {
			if (this.getRating() == other.getRating()) {
				return this.id.compareTo(other.id);
			} else if (this.getRating() > other.getRating()) {
				return 1;
			} else {
				return -1;
			}
		} else if (this.flag() && !other.flag()) {
			return 1;
		} else {
			return 0;
		}
	}
}
