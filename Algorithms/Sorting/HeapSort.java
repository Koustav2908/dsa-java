public class HeapSort {

    static void sort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, arr.length, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(arr, i, 0);
        }
    }

    static void heapify(int[] arr, int n, int i) {
        int largest = i, left = 2 * i + 1, right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, n, largest);
        }
    }

    static void display(int[] arr) {
        for (int a : arr)
            System.out.print(a + "\t");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = { 100, 7, 9, -3, 97, 56, 109, 4, -43, 12 };

        System.out.println("Array before sorting: ");
        display(numbers);

        sort(numbers);

        System.out.println("Array after sorting: ");
        display(numbers);
    }
}