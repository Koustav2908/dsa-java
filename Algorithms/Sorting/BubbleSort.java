public class BubbleSort {

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void display(int[] arr) {
        for (int a : arr)
            System.out.print(a + "\t");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = { 12, 90, 6, 0, 3, -2, 56, 100, 23, 7 };

        System.out.println("Array before sorting: ");
        display(numbers);

        sort(numbers);

        System.out.println("Array after sorting: ");
        display(numbers);
    }
}