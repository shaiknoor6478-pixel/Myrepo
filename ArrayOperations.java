import java.util.Arrays;
import java.util.Scanner;
class ArrayOperations {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static int[] insertElement(int[] arr, int element, int position) {
        if (position < 0 || position > arr.length) {
            System.out.println("Invalid position");
            return arr;
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }
        newArr[position] = element;
        for (int i = position; i < arr.length; i++) {
            newArr[i+1] = arr[i];
        }
        return newArr;
    }
    public static int[] deleteElement(int[] arr, int position) {
        if (position < 0 || position >= arr.length) {
            System.out.println("Invalid position");
            return arr;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }
        for (int i = position + 1; i < arr.length; i++) {
            newArr[i-1] = arr[i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {5, 3, 8, 6, 2};
        System.out.println("Original array: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.print("Enter element to search: ");
        int key = scanner.nextInt();
        int index = linearSearch(arr, key);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

        System.out.print("Enter element to insert: ");
        int elemToInsert = scanner.nextInt();
        System.out.print("Enter position to insert (0 to " + arr.length + "): ");
        int posInsert = scanner.nextInt();
        arr = insertElement(arr, elemToInsert, posInsert);
        System.out.println("Array after insertion: " + Arrays.toString(arr));
        System.out.print("Enter position to delete (0 to " + (arr.length - 1) + "): ");
        int posDelete = scanner.nextInt();
        arr = deleteElement(arr, posDelete);
        System.out.println("Array after deletion: " + Arrays.toString(arr));
        scanner.close();
    }
}
