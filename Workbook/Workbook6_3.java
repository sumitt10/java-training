public class Workbook6_3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        reverseArray(numbers);
        System.out.println("Reversed Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
