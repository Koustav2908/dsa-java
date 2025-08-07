public class MergeSort {

    static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;

            sort(arr, low, mid);
            sort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int l1 = mid - low + 1;
        int l2 = high - mid;

        int[] left = new int[l1];
        int[] right = new int[l2];

        int mainIndex = low;
        for (int i = 0; i < l1; i++)
            left[i] = arr[mainIndex++];

        mainIndex = mid + 1;
        for (int i = 0; i < l2; i++)
            right[i] = arr[mainIndex++];

        int leftIndex = 0, rightIndex = 0;
        mainIndex = low;

        while (leftIndex < l1 && rightIndex < l2) {
            if (left[leftIndex] <= right[rightIndex])
                arr[mainIndex++] = left[leftIndex++];
            else
                arr[mainIndex++] = right[rightIndex++];
        }

        while (leftIndex < l1)
            arr[mainIndex++] = left[leftIndex++];

        while (rightIndex < l2)
            arr[mainIndex++] = right[rightIndex++];
    }

    static void display(int[] arr) {
        for (int a : arr)
            System.out.print(a + "\t");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = { 9, 80, -3, 45, 0, 12, 5, 37, -4, 91 };

        System.out.println("Array before sorting: ");
        display(numbers);

        sort(numbers, 0, numbers.length - 1);

        System.out.println("Array after sorting: ");
        display(numbers);
    }
}