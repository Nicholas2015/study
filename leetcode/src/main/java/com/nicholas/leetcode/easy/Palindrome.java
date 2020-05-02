package com.nicholas.leetcode.easy;

import java.util.Objects;

public class Palindrome {

    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();

        char[] tempChar = new char[chars.length];
        int count = 0;
        for (int i = chars.length-1; i >= 0; i--) {
            tempChar[count++] = chars[i];
        }

        String newStr = String.valueOf(tempChar);

        return Objects.equals(s,newStr);
    }
}
