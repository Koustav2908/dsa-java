public class LinearSearch {

    static int search(int[] arr, int key) {
        if (arr.length <= 0)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = { 12, 9, 67, -5, 8, 32, 0, 68, 102, -43 };
        int key = 0;

        int index = search(numbers, key);

        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found.");
    }
}