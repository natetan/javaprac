public static int indexOf(int[] list, int num) {
    int index = -1;
    for (int i = 0; i < list.length; i++) {
        if (list[i] == num) {
            index = i;
            break;
            
        }
    }
    return index;
}