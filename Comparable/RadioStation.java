public class RadioStation implements Comparable<RadioStation> {
	private String name, band, simulcast
	private double number;

	public RadioStation(String name, String band, double num) {
		this.name = name;
		this.band = band;
		this.number = num;
		this.simulcast = "";
	}

	public String getName() {
		return this.name;
	}

	public String getBand() {
		return this.band;
	}

	public double getNumber() {
		return this.number;
	}

	public String toString() {
		return this.name + " " + this.band + " " + this.number + " " + this.simulcast;
	}

	public void simulcast(RadioStation other) {
		if (this.name.equals(other.name)) {
			this.simulcast = "(simulcast on " + other.band + " " + other.number + ")";
		} else {
			this.simulcast = "";
		}
	}

	public int compareTo(RadioStation swagMoneyIllest) {
		if (this.band.equals(swagMoneyIllest.band)) {
			return (int)Math.signum(this.number - swagMoneyIllest.number);
		} else {
			return this.band.compareTo(swagMoneyIllest.band);
		}
	}
}
