public class BinarySearch {

    static int search(int[] arr, int key) {
        if (arr.length <= 0)
            return -1;

        int low = 0, high = arr.length - 1;
        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2;

            if (key == arr[mid])
                return mid;
            else if (key < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = { -43, -3, 0, 7, 12, 35, 38, 46, 68, 102 };
        int key = 0;

        int index = search(numbers, key);

        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found.");
    }
}