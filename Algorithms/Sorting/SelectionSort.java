public class SelectionSort {

    static int minimum(int[] arr, int start) {
        int minIndex = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex])
                minIndex = i;
        }
        return minIndex;
    }

    static void sort(int[] arr) {
        int minIndex, temp;

        for (int i = 0; i < arr.length; i++) {
            minIndex = minimum(arr, i);
            if (minIndex != i) {
                temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    static void display(int[] arr) {
        for (int a : arr)
            System.out.print(a + "\t");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = { -12, 9, 0, 23, 81, -34, 56, 8, 45, 9 };

        System.out.println("Array before sorting: ");
        display(numbers);

        sort(numbers);

        System.out.println("Array after sorting: ");
        display(numbers);
    }
}