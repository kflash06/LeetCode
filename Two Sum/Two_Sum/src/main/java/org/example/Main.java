package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int target = 3;
        System.out.println(Arrays.toString(Solution.twoSum(num,target)));
    }
}