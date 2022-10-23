package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        nullAndLengthValidation(password);
        isLowerCasePresent(password);
        isUpperCasePresent(password);
        isDigitPresent(password);
        isSpecialSymbolPresent(password);
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

    private static void isLowerCasePresent(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                break;
            }
            if (i == password.length() - 1) {
                throw new IllegalArgumentException("Password must contain at least one lowercase letter");
            }
        }
    }

    private static void isUpperCasePresent(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                break;
            }
            if (i == password.length() - 1) {
                throw new IllegalArgumentException("Password must contain at least one uppercase letter");
            }
        }
    }

    private static void isDigitPresent(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                break;
            }
            if (i == password.length() - 1) {
                throw new IllegalArgumentException("Password must contain at least one digit");
            }
        }
    }

    private static void isSpecialSymbolPresent(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                break;
            }
            if (i == password.length() - 1) {
                throw new IllegalArgumentException("Password must contain at least one special symbol");
            }
        }
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