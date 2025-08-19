class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 3, 7, 2, 8, 4, 6};
        int target = 6;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println(" Element " + target + " found at index " + index);
        } else {
            System.out.println(" Element " + target + " not found at index ");
        }
    }
}
