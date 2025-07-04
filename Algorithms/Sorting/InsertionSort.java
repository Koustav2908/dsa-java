public class InsertionSort {

    static void sort(int[] arr) {
        int j, temp;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    static void display(int[] arr) {
        for (int a : arr)
            System.out.print(a + "\t");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = { 22, 0, 90, -4, 7, 15, -45, 3, 84, 1 };

        System.out.println("Array before sorting: ");
        display(numbers);

        sort(numbers);

        System.out.println("Array after sorting: ");
        display(numbers);
    }
}