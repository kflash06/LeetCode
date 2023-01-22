package org.example;

public class Solution {
    public static int removeElement(int[] nums, int val) {
        int count = 0, e = nums.length;
        for(int i = 0; i < e; i++) {
            if(nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
