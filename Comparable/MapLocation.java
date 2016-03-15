public class MapLocation implements Comparable<MapLocation> {
	private char row;
	private int col;
	private String name;

	public MapLocation(char row, int col, String name) {
		if (col < 0 || row < 'A' || row > 'Z') {
			throw new IllegalArgumentException("please give me a 4.0");
		}
		this.row = row;
		this.col = col;
		this.name = name;
	}

	public String getCoordinates() {
		return "" + this.row + this.col;
	}

	public String getName() {
		return this.name;
	}

	public String toString() {
		return this.name + " (" + this.getCoordinates() + ")";
	}

	public int compareTo(MapLocation other) {
		if (this.row == other.row) {
			if (this.col == other.col) {
				return this.name.compareTo(other.name);
			} else {
				return this.col - other.col;
			}
		} else {
			return this.row - other.row;
		}
	}
}
