import java.util.ArrayList;
import java.util.List;

public class RadixSort {

    static void sort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int a : arr) {
            if (a > max)
                max = a;
        }

        int max_digits = String.valueOf(max).length();

        for (int i = 0; i < max_digits; i++) {
            List<List<Integer>> int_buckets = new ArrayList<>(10);

            for (int b = 0; b < 10; b++)
                int_buckets.add(new ArrayList<>(10));

            for (int a : arr) {
                int digit = (a / (int) Math.pow(10, i)) % 10;
                int_buckets.get(digit).add(a);
            }
            int index = 0;
            for (List<Integer> buckets : int_buckets)
                for (int bucket : buckets)
                    arr[index++] = bucket;
        }
    }

    static void display(int[] arr) {
        for (int a : arr)
            System.out.print(a + "\t");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = { 538, 102, 761, 320, 764, 328, 653, 8, 22314, 70 };

        System.out.println("Array before sorting: ");
        display(numbers);

        sort(numbers);

        System.out.println("Array after sorting: ");
        display(numbers);
    }
}