import java.util.Scanner;
public class lapassi {
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double weight = input.nextDouble();
        System.out.print("Enter height (m): ");
        double height = input.nextDouble();

        double bmi = calculateBMI(weight, height);
        System.out.printf("Your BMI is: %.2f\n", bmi);
    }
}
