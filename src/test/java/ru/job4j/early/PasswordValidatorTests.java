package ru.job4j.early;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static ru.job4j.early.PasswordValidator.validate;

public class PasswordValidatorTests {
    IllegalArgumentException exception;

    @Test
    public void whenPassIsValid() {
        assertEquals("Password is valid", validate("Super7o9!"));
    }

    @Test
    public void whenPassIsNull() {
        exception = assertThrows(IllegalArgumentException.class, () -> validate(null));
        assertEquals("Password must be not null", exception.getMessage());
    }

    @Test
    public void whenPassLessThen8Symbols() {
        exception = assertThrows(IllegalArgumentException.class, () -> validate("passwor"));
        assertEquals("Password length should be from 8 to 32 symbols", exception.getMessage());
    }

    @Test
    public void whenPassMoreThen32Symbols() {
        exception = assertThrows(IllegalArgumentException.class,
                () -> validate("passwordpasswordpasswordpasswordpassword"));
        assertEquals("Password length should be from 8 to 32 symbols", exception.getMessage());
    }

    @Test
    public void whenPassOnlyLowerCaseLetters() {
        exception = assertThrows(IllegalArgumentException.class, () -> validate("strongpas"));
        assertEquals("Password must contain at least one uppercase letter", exception.getMessage());
    }

    @Test
    public void whenPassOnlyUpperCaseLetters() {
        exception = assertThrows(IllegalArgumentException.class, () -> validate("STRONGPAS"));
        assertEquals("Password must contain at least one lowercase letter", exception.getMessage());
    }

    @Test
    public void whenPassDoesntContainDigits() {
        exception = assertThrows(IllegalArgumentException.class, () -> validate("Strongpas"));
        assertEquals("Password must contain at least one digit", exception.getMessage());
    }

    @Test
    public void whenPassDoesntContainSpecialSymbols() {
        exception = assertThrows(IllegalArgumentException.class, () -> validate("Strongpas7"));
        assertEquals("Password must contain at least one special symbol", exception.getMessage());
    }

    @Test
    public void whenPassDoesntContainCommonSubstrings() {
        exception = assertThrows(IllegalArgumentException.class, () -> validate("Strongpas7#12345"));
        assertTrue(exception.getMessage().contains("Password mustn't contain substring "));
    }
}
