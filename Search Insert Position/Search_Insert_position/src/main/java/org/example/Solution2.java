package org.example;

public class Solution2 {
    public static int searchInsert(int[] nums, int target1) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target1 < nums[mid]) {
                end = mid - 1;
            }

            else if (target1 > nums[mid]) {
                start = mid + 1;
            }

            else {
                return mid;
            }
        }
        return start;
    }
}
