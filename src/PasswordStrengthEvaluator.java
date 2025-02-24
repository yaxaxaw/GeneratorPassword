import com.nulabinc.zxcvbn.Zxcvbn;

public class PasswordStrengthEvaluator {

    private static final Zxcvbn zxcvbn = new Zxcvbn();

    public static <Result> void evaluatePasswordStrength(String password) {

        Result result = (Result) zxcvbn.measure(password);

        int score = ((com.nulabinc.zxcvbn.Strength) result).getScore();

        switch (score) {
            case 0:
                System.out.println("Password strength: Very Weak");
                break;
            case 1:
                System.out.println("Password strength: Weak");
                break;
            case 2:
                System.out.println("Password strength: Fair");
                break;
            case 3:
                System.out.println("Password strength: Strong");
                break;
            case 4:
                System.out.println("Password strength: Very Strong");
                break;
            default:
                System.out.println("Password strength: Unknown");
                break;
        }
    }
}
