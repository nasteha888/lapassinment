import java.util.Scanner;
import java.util.Arrays;
public class largestnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[7];

        System.out.println("Enter 7 integers:");
        for (int i = 0; i < 7; i++) {
            numbers[i] = input.nextInt();
        }

        Arrays.sort(numbers);
        int largest = numbers[6];
        int secondLargest = numbers[5];

        for (int i = 5; i >= 0; i--) {
            if (numbers[i] < largest) {
                secondLargest = numbers[i];
                break;
            }
        }

        System.out.println("Second largest number is: " + secondLargest);
    }
}
