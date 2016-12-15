/*
	
	This class represents a Rectangle

*/

public class Rectangle {

  private int x, y, width, height;
  
	public Rectangle(Point p, int width, int height) {
	    this(p.x, p.y, width, height);
	}
  public Rectangle(int x, int y, int width, int height) {
    if (width < 0 || height < 0) {
      throw new IllegalArgumentException();
    }
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }
  
  public int getHeight() {
    return this.height;
  }
  
  public int getWidth() {
    return this.width;
  }
  
  public int getX() {
    return this.x;
  }
  
  public int getY() {
    return this.y;
  }

	public boolean contains(Point p) {
	  return this.contains(p.x, p.y);
	}

	public boolean contains(int x, int y) {
	  if (x > this.x + this.width) {
	    return false;
	  } else if (x < this.x) {
	    return false;
	  } else if (y > this.y + this.height) {
	    return false;
	  } else if (y < this.y) {
	    return false;
	  } else {
	    return true;
	  }
	}

	public Rectangle union(Rectangle rect) {
	  int newX = Math.min(this.getX(), rect.getX());
	  int newY = Math.min(this.getY(), rect.getY());
	  int newWidth = Math.max(rect.getX() + rect.getWidth() - newX, this.getX() + this.getWidth() - newX);
	  int newHeight = Math.max(rect.getY() + rect.getHeight() - newY, this.getY() + this.getHeight() - newY);
	  return new Rectangle(newX, newY, newWidth, newHeight);
	}
  
  public String toString() {
    return "Rectangle[x=" + this.x + ",y=" + this.y + 
        ",width=" + this.width + ",height=" + this.height + "]";
  }
}