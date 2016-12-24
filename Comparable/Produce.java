public class Produce implements Comparable<Produce> {
	public double weight;
	public String name;
	public boolean organic, fruit;

	public Produce(double weight, String name, boolean organic, boolean fruit) {
		this.weight = weight;
		this.name = name;
		this.organic = organic;
		this.fruit = fruit;
	}

	public String toString() {
		String result = "";
		if (this.organic) {
			result += "*";
		}
		result += this.name + " ";
		if (this.fruit) {
			result += "(F) ";
		}
		result += "- " + this.weight + " lbs";
		return result;
	}

	public int compareTo(Produce other) {
		if (this.organic && !other.organic) {
			return -1;
		} else if (!this.organic && other.organic) {
			return 1;
		} else if (!this.fruit && other.fruit) {
			return 1;
		} else if (this.name.compareTo(other.name) != 0) {
			return this.name.compareTo(other.name);
		} else {
			return (int)Math.signum(this.weight - other.weight);
		}
	}
}
