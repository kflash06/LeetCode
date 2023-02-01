package org.example;

public class Main {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        Solution solution = new Solution();
        System.out.println(solution.gcdOfStrings(str1, str2));
    }
}