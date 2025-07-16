import java.util.Scanner;
public class sumarrey {
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }

        int total = sumArray(numbers);
        System.out.println("Sum of array elements: " + total);
    }
}
