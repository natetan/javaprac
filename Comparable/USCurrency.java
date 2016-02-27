public class USCurrency implements Comparable<USCurrency> {
    private int totalCents;
    
    public USCurrency(int dollars, int cents) {
        totalCents = dollars * 100 + cents;
    }
    
    public int dollars() {
        return totalCents / 100;
    }
    
    public int cents() {
        return totalCents % 100;
    }
    
    public String toString() {
        int cents = Math.abs(totalCents);
        String s = cents / 100 + "." + cents % 100 / 10 + cents % 10;
        if (totalCents < 0) {
            return "-$" + s;
        } else {
            return "$" + s;
        }
    }
    
    public USCurrency add(USCurrency other) {
        return new USCurrency(dollars() + other.dollars(),
        cents() + other.cents());
    }
    
    public USCurrency subtract(USCurrency other) {
        return new USCurrency(dollars() - other.dollars(),
        cents() - other.cents());
    }

    public int compareTo(USCurrency other) {
        if (this.dollars() == other.dollars()) {
            return this.cents() - other.cents();
        } else {
            return this.dollars() - other.dollars();
        }
    }
}