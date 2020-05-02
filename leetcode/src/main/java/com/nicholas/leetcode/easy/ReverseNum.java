package com.nicholas.leetcode.easy;

public class ReverseNum {

    public int reverse(int x) {
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();


        int tempSize = 0;
        for (char c : chars) {
            if (c == '0'){
                continue;
            }
            tempSize++;
        }

        int count = 0;
        char[] tempChar = new char[tempSize];
        for (char c : chars) {
            if (c == '0'){
                continue;
            }
            tempChar[count] = c;
            count++;
        }

        int num = 0;
        char[] newChar = new char[tempSize];
        if (x > 0){
            for (int i = tempSize - 1; i >=0; i--) {
                newChar[num] = tempChar[i];
                num++;
            }
        } else {
            newChar[num] = tempChar[0];
            num++;
            for (int i = tempSize - 1; i >= 1 ; i--) {
                newChar[num] = tempChar[i];
                num++;
            }
        }
        String newStr = String.valueOf(newChar);
        return Integer.valueOf(newStr);
    }

   /* public static void main(String[] args) {
        ReverseNum solution = new ReverseNum();
        int num = solution.reverse(-102);
        System.out.println(num);
    }*/
}
