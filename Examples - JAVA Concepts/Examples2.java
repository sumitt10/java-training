import java.util.ArrayList;

public class Examples2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();

        numbersList.add(2);
        numbersList.add(5);
        numbersList.add(8);
        numbersList.add(10);

        int sum = sumOfEvenNumbers(numbersList);
        System.out.println("Sum of Even Numbers: " + sum);
    }

    static int sumOfEvenNumbers(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}
