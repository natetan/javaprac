public class Location implements Comparable<Location> {
    private String name;
    private double latitude;
    private double longitude;
    
    public Location(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    public String getName() {
        return name;
    }
    
    public double getLatitude() {
        return latitude;
    }
    
    public double getLongitude() {
        return longitude;
    }
    
    public String toString() {
        String result = name + " " + Math.abs(latitude);
        if (latitude < 0) {
            result += "S";
        } else {
            result += "N";
        }
        result += " " + Math.abs(longitude);
        if (longitude < 0) {
            result += "E";
        } else {
            result += "W";
        }
        return result;
    }

    public int compareTo(Location other) {
        if (this.latitude == other.latitude) {
            return (int)Math.signum(Math.abs(this.longitude) - Math.abs(other.longitude));
        } else {
            return (int)Math.signum(Math.abs(this.latitude) - Math.abs(other.latitude));
        }
    }

}