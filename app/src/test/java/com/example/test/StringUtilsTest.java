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
//    @Test
//    public void testIsPalindrome_fail() {
//        // Đây là một chuỗi không phải là palindrome, nhưng chúng ta giả sử là nó đúng
//        assertTrue(StringUtils.isPalindrome("Hello"));
//    }

}
