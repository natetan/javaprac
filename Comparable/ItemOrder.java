public class ItemOrder implements Comparable<ItemOrder> {
	private String item, message;
	private int count, pennies;

	public ItemOrder(String item, int count, int pennies) {
		this(item, "", count, pennies);
	}

	public ItemOrder(String item, String message, int count, int pennies) {
		this.item = item;
		this.message = message;
		this.count = count;
		this.pennies = pennies;
	}

	public String getItem() {
		return this.item;
	}

	public int getPrice() {
		return this.pennies * this.count;
	}

	public String toString() {
		String totalCents = this.getPrice();
		int dollars = 0;
		while (totalCents > 99) {
			dollars += 1;
			totalCents -= 100;
		}
		String cents = "";
		if (totalCents < 10) {
			cents += "0";
		}
		String msg = "";
		if (this.message != null) {
			msg += " (" + this.message + ")";
		}
		return "item #" + this.item + msg + ": " + this.count + "@$" + dollars + "." + cents + totalCents;
	}

	public int compareTo(ItemOrder other) {
		if (!this.item.equals(other.item)) {
			return -(this.pennies - other.pennies);
		} else {
			return this.item.compareTo(other.item);
		}
	}
}

