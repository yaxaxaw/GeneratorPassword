import java.util.Scanner;

public class PasswordApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PasswordGenerator generator = new PasswordGenerator();

        System.out.print("Enter password length: ");
        int length = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Include uppercase letters? (yes/no): ");
        boolean useUppercase = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Include lowercase letters? (yes/no): ");
        boolean useLowercase = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Include numbers? (yes/no): ");
        boolean useNumbers = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Include special symbols? (yes/no): ");
        boolean useSpecial = scanner.nextLine().equalsIgnoreCase("yes");

        String password = generator.generatePassword(length, useUppercase, useLowercase, useNumbers, useSpecial);
        System.out.println("Generated password: " + password);

        PasswordStrengthEvaluator.evaluatePasswordStrength(password);
    }
}
