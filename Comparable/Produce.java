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
		if (organic) {
			result += "*";
		}
		result += name + " ";
		if (fruit) {
			result += "(F) ";
		}
		result += "- " + weight + " lbs";
		return result;
	}

	public int compareTo(Produce other) {
		if (organic && !other.organic) {
			return -1;
		} else if (!organic && other.organic) {
			return 1;
		} else if (!fruit && other.fruit) {
			return 1;
		} else if (name.compareTo(other.name) != 0) {
			return name.compareTo(other.name);
		} else {
			return (int)Math.signum(this.weight - other.weight);
		}
	}
}
