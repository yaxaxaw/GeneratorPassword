import java.util.Random;

public class PasswordGenerator {
    private static final String LOWERCASE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_SYMBOLS = "!@#$%^&*()-_=+[]{};:,.<>/?";

    private final Random random;

    public PasswordGenerator() {
        random = new Random();
    }

    public String generatePassword(int length, boolean includeUppercase, boolean includeLowercase,
                                   boolean includeNumbers, boolean includeSpecialSymbols) {
        StringBuilder passwordBuilder = new StringBuilder();
        String validCharacters = "";

        if (includeUppercase) validCharacters += UPPERCASE_CHARACTERS;
        if (includeLowercase) validCharacters += LOWERCASE_CHARACTERS;
        if (includeNumbers) validCharacters += NUMBERS;
        if (includeSpecialSymbols) validCharacters += SPECIAL_SYMBOLS;

        if (validCharacters.isEmpty()) {
            return "Error: You must select at least one type of character.";
        }

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(validCharacters.length());
            passwordBuilder.append(validCharacters.charAt(randomIndex));
        }
        return passwordBuilder.toString();
    }
}
