package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        nullAndLengthValidation(password);
        char[] passChars = password.toCharArray();
        isLowerCasePresent(passChars);
        isUpperCasePresent(passChars);
        isDigitPresent(passChars);
        isSpecialSymbolPresent(passChars);
        subStringValidation(password);
        return "Password is valid";
    }

    private static void nullAndLengthValidation(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password must be not null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password length should be from 8 to 32 symbols");
        }
    }

    private static void isLowerCasePresent(char[] passChars) {
        for (char c : passChars) {
            if (!Character.isLowerCase(c)) {
                return;
            }
        }
        throw new IllegalArgumentException("Password must contain at least one uppercase letter");
    }

    private static void isUpperCasePresent(char[] passChars) {
        for (char c : passChars) {
            if (Character.isUpperCase(c)) {
                return;
            }
        }
        throw new IllegalArgumentException("Password must contain at least one lowercase letter");
    }

    private static void isDigitPresent(char[] passChars) {
        for (char c : passChars) {
            if (Character.isDigit(c)) {
                return;
            }
        }
        throw new IllegalArgumentException("Password must contain at least one digit");
    }

    private static void isSpecialSymbolPresent(char[] passChars) {
        for (char c : passChars) {
            if (!Character.isLetterOrDigit(c)) {
                return;
            }
        }
        throw new IllegalArgumentException("Password must contain at least one special symbol");
    }

    private static void subStringValidation(String password) {
        String[] subStrings = {"qwerty", "12345", "password", "admin", "user"};
        for (String s : subStrings) {
            if (password.toLowerCase().contains(s.toLowerCase())) {
                throw new IllegalArgumentException("Password mustn't contain substring " + s);
            }
        }
    }
}