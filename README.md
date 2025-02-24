Password Generator and Strength Evaluator

This project is a Java application that generates random passwords based on user preferences and evaluates their strength. It consists of three main components:

PasswordApp.java: Handles user input and coordinates the password generation and evaluation process.

PasswordGenerator.java: Generates a random password based on the specified length and character types.

PasswordStrengthEvaluator.java: Evaluates the strength of the generated password using the Zxcvbn library.

Key Features:
Customizable Password Generation: Users can specify the password length and choose to include uppercase letters, lowercase letters, numbers, and special symbols.

Password Strength Evaluation: The program evaluates the strength of the generated password on a scale from "Very Weak" to "Very Strong."

Input Validation: Ensures that at least one type of character is selected for password generation.

How It Works:
User Input:

The user is prompted to enter the desired password length.

The user selects which types of characters to include (uppercase, lowercase, numbers, special symbols).

Password Generation:

The PasswordGenerator class creates a random password using the specified character types and length.

If no character type is selected, the program returns an error message.

Password Strength Evaluation:

The PasswordStrengthEvaluator class uses the Zxcvbn library to assess the password's strength and displays the result.

Code Structure:
PasswordApp.java:

Handles user interaction and input.

Calls the PasswordGenerator to create a password and the PasswordStrengthEvaluator to assess its strength.

PasswordGenerator.java:

Contains predefined character sets (uppercase, lowercase, numbers, special symbols).

Uses a Random object to generate a password by selecting characters from the valid set.

PasswordStrengthEvaluator.java:

Uses the Zxcvbn library to evaluate password strength based on complexity and common patterns.

Outputs the strength level (Very Weak, Weak, Fair, Strong, Very Strong).

Challenges:
Ensuring that the generated password includes at least one type of character.

Integrating the Zxcvbn library for accurate password strength evaluation.

![image](https://github.com/user-attachments/assets/b7d1aa46-1d9c-46df-8e7b-645a74a152e7)

![image](https://github.com/user-attachments/assets/f4fc392e-5f52-4a82-9aa0-59a4eee7e9fb)

![image](https://github.com/user-attachments/assets/763b50d5-4b9e-4718-8b0d-0df480676a1c)


