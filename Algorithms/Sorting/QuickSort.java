public class QuickSort {

    static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = partition(arr, low, high);

            sort(arr, low, mid - 1);
            sort(arr, mid + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void display(int[] arr) {
        for (int a : arr)
            System.out.print(a + "\t");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = { 89, 0, 56, 2, -7, 9, 45, 4, 9, 34 };

        System.out.println("Array before sorting: ");
        display(numbers);

        sort(numbers, 0, numbers.length - 1);

        System.out.println("Array after sorting: ");
        display(numbers);
    }
}