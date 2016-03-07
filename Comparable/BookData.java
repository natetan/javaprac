public class BookData implements Comparable<BookData> {
	private String title;
	private String author;
	private double rating;
	private int count;

	public BookData(String title, String author) {
		this.title = title;
		this.author = author;
		this.rating = 0;
		this.count = 0;
	}

	public void review(double rating) {
		this.rating += rating;
		this.count++;
	}

	public String getTitle() {
		return this.title;
	}

	public double getRating() {
		if (this.count == 0) {
			return 0.0;
		} else {
			return this.rating / this.count;
		}
	}

	public String toString() {
		String review = "";
		if (this.count > 1) {
			review = "reviews";
		} else {
			review = "review";
		}
		return this.title + ", by " + this.author + ", " +
			(Math.floor(this.getRating() * 10)) / 10 + " (" +
			this.count + " " + review + ")";
	}

	public int compareTo(BookData other) {
		int average = (int)Math.signum(this.getRating() - other.getRating());
		if (average == 0) {
			return -(this.count - other.count);
		} else {
			return average;
		}
	}
}
