public static void countToBy(int max, int increment) {
    if (max < 1 || increment < 1) {
        throw new IllegalArgumentException();
    }
    if (increment > max) { // greater
        System.out.print(max);
    } else if (max == increment) { // equal
        System.out.print(max);
    } else { // less
        countToBy(max - increment, increment);
        System.out.print(", " + max);
    } 
    
    /*
        c(8, 4)
        c(4, 4) + , 8
        4, 8
        
        MUST CONSIDER THESE CASES
        less than, greater than, equal
    */
}
