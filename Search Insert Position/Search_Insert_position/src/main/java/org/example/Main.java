package org.example;

public class Main {
    public static void main(String[] args) {
        int target = 0;
        int target1 = 4;
        int[] nums = {1,3,5,6};
        System.out.println(Solution.searchInsert(nums,target));
        System.out.println(Solution2.searchInsert(nums,target1));
    }
}