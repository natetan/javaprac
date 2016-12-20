public class Line {

	private Point p1, p2;

	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Line(int x1, int y1, int x2, int y2) {
		this(new Point(x1, y1), new Point(x2, y2));
	}

	public Point getP1() {
		return this.p1;
	}

	public Point getP2() {
		return this.p2;
	}

	public double getSlope() {
		if (this.p1.x == this.p2.x) {
			throw new IllegalArgumentException();
		}
		return ((double) ((this.p1.y - this.p2.y)) / (this.p1.x - this.p2.x));
	}

	public boolean isCollinear(Point p) {
		if (this.p1.x == this.p2.x && this.p2.x == p.x) {
			throw new IllegalArgumentException();
		}
		double slope1 = ((double) ((this.p1.y - this.p2.y)) / (this.p1.x - this.p2.x));
		double slope2 = ((double) ((this.p2.y - p.y)) / (this.p2.x - p.x));
		return slope1 == slope2;
	}

	public String toString() {
		return "[(" + p1.x + ", " + p1.y + "), (" + p2.x + ", " + p2.y + ")]";
	}
}