package org.example;

public class Solution {
    public static int searchInsert(int[] nums, int target) {
        if (nums[nums.length -1] == target)
            return nums[nums.length -1];
        else if (target <= 0) {
            return 0;
        }
        int temp = nums.length;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target)
                temp = i;
            else if (target > nums[i] && target < nums [i + 1]) {
                temp = i + 1;
            }
        }
        return temp;
    }
}