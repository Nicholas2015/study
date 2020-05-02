package com.nicholas.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class EasySolutionTest {

    @Test
    public void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        TwoSum solution = new TwoSum();
        int[] indexs = solution.twoSum(nums, 9);
        System.out.println(Arrays.toString(indexs));
    }

    @Test
    public void testReverse() {
        ReverseNum solution = new ReverseNum();
        int num = solution.reverse(-12356025);
        System.out.println(num);
    }

    @Test
    public void testPalindrome() {
        Palindrome palindrome = new Palindrome();
        boolean flag = palindrome.isPalindrome(101);
        System.out.println("101 is " + (flag ? "Palindrome" : "not Palindrome"));

        flag = palindrome.isPalindrome(10);
        System.out.println("10 is " + (flag ? "Palindrome" : "not Palindrome"));

        flag = palindrome.isPalindrome(-121);
        System.out.println("-121 is " + (flag ? "Palindrome" : "not Palindrome"));
    }

    @Test
    public void testRomanNum(){
        RomanNum romanNum = new RomanNum();
        System.out.println("Roman(III) is Arabic("+ romanNum.romanToInt("III") +")");
        System.out.println("Roman(IV) is Arabic("+ romanNum.romanToInt("IV") +")");
        System.out.println("Roman(IX) is Arabic("+ romanNum.romanToInt("IX") +")");
        System.out.println("Roman(LVIII) is Arabic("+ romanNum.romanToInt("LVIII") +")");
        System.out.println("Roman(MCMXCIV) is Arabic("+ romanNum.romanToInt("MCMXCIV") +")");
    }
}
