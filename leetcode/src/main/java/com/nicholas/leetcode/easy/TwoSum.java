package com.nicholas.leetcode.easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                int num2 = nums[j];
                if ((num1 + num2) == target){
                    result.add(i);
                    result.add(j);
                }
            }
        }

        int[] indexs = new int[result.size()];
        Iterator<Integer> iterator = result.iterator();
        int count = 0;
        while (iterator.hasNext()){
            Integer next = iterator.next();
            indexs[count] = next;
            count++;
        }
        return indexs;
    }
}
