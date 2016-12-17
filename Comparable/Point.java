public class Point {

	public int x;
	public int y;
	    
	public Point() {
		setLocation(0, 0);
	}
	    
	public Point(int x, int y) {
		setLocation(x, y);
	}
	    
	public double distanceFromOrigin() {
		return distance(new Point());
	}
	    
	public double distance(Point p) {
		int dx = x - p.x;
		int dy = y - p.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
	    
	public final int getX() {
		return x;
	}
	    
	public final int getY() {
		return y;
	}
	    
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public void translate(int dx, int dy) {
		setLocation(x + dx, y + dy);
	}

	public int quadrant() {
		if (this.x == 0 || this.y == 0) {
			return 0;
		} else if (this.x > 0 && this.y > 0) {
			return 1;
		} else if (this.x < 0 && this.y > 0) {
			return 2;
		} else if (this.x < 0 && this.y < 0) {
			return 3;
		} else {
			return 4;
		}
	}

	public void flip() {
		int temp = this.x;
		this.x = this.y;
		this.y = temp;
	}

	public int manhattanDistance(Point other) {
		int x = Math.abs(this.x - other.x);
		int y = Math.abs(this.y - other.y);
		return x + y;
	}

	public boolean isVertical(Point other) {
		return this.x == other.x;
	}

	public double slope(Point other) {
		if (this.x == other.x) {
			throw new IllegalArgumentException();
		} else {
			return ((double) (this.y - other.y)) / (this.x - other.x);
		}
	}

	public boolean isCollinear(Point p2, Point p3) {
		if ((this.x == p2.x && this.x == p3.x && p2.x == p3.x) || this.y == p2.y && this.y == p3.y && p2.y == p3.y) {
			return true;
		}
		int x1 = this.x;
		int y1 = this.y;
		int x2 = p2.x;
		int y2 = p2.y;
		int x3 = p3.x;
		int y3 = p3.y;

		double slope1 = ((double) (y2 - y1)) / (x2 - x1);
		double slope2 = ((double) (y3 - y2)) / (x3 - x2);

		return slope1 == slope2;
	}
}