package eu.sig.training.ch04;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class AccountTest {

    @Test
    public void testIsValidNormalCases() {
        assertTrue("isValid(\"123456789\") should return true", Account.isValid("123456789"));
        assertFalse("isValid(\"123456788\") should return false", Account.isValid("123456788"));
    }

    @Ignore("Deliberately fails for illustration purpose")
    @Test
    public void testEmptyString() {
        assertFalse(Account.isValid(""));
    }

    @Ignore("Deliberately fails for illustration purpose")
    @Test
    public void showError() {
        int dummy = 1 / 0;
        assertTrue("You will never see this text.", true);
    }

    @Test
    @Ignore
    public void testIsValidLetters() {
        assertFalse("isValid(\"abcdefghi\") should return false", Account.isValid("ABCDEFGHK"));
    }

    @Test
    @Ignore
    public void testIsValidNonNormal() {
        assertFalse("Empty string is not a valid number", Account.isValid(""));
    }

    @Test
    @Ignore
    public void testIsValidNonNumeric() {
        assertFalse("Non-numerics always invalid", Account.isValid("12.34.56."));
    }

    @Test
    @Ignore
    public void testIsValidToolong() {
        assertFalse("More than 9 digits is always invalid", Account.isValid("1234567890"));
    }

    @Test
    @Ignore
    public void testIsValidTooshort() {
        assertFalse("Less than 9 digits is always invalid", Account.isValid("12345677"));
    }

}