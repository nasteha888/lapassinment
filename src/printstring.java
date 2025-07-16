import java.util.Scanner;
public class printstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strings = new String[5];

        System.out.println("Enter 5 strings:");
        for (int i = 0; i < 5; i++) {
            strings[i] = input.nextLine();
        }

        System.out.println("Strings in uppercase:");
        for (String s : strings) {
            System.out.println(s.toUpperCase());
        }
    }
}
