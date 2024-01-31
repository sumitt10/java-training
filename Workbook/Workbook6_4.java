public class Workbook6_4 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 4, 6};
        int sum = findSum(numbers);
        System.out.println("Sum of Array Elements: " + sum);
    }

    static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
