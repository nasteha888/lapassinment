import java.util.Scanner;
public class score {
    public static String gradeCategory(int score) {
        if (score >= 90) return "Excellent";
        else if (score >= 75) return "Good";
        else if (score >= 50) return "Average";
        else return "Fail";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = input.nextInt();

        String grade = gradeCategory(score);
        System.out.println("Grade category: " + grade);
    }
}
