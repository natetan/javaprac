public static int[] stretch(int[] list1) {
    int[] list2 = new int[list1.length * 2];
    for (int i = 0; i < list1.length; i++) {
        int num = list1[i];
        if (num % 2 == 0) {
            list2[i * 2] = num / 2;
            list2[i * 2 + 1] = num / 2;
        } else {
            list2[i * 2] = num / 2 + 1;
            list2[i * 2 + 1] = num / 2;
        }
    }
    return list2;
}