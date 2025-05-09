package com.example.test;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {
    @Test
    public void testIsPalindrome_true() {
        assertTrue(StringUtils.isPalindrome("Madam"));
    }

    @Test
    public void testIsPalindrome_false() {
        assertFalse(StringUtils.isPalindrome("Hello"));
    }
    @Test
    public void testIsPalindrome_null() {
        assertFalse(StringUtils.isPalindrome(null));
    }
}
