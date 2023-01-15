public class Solution {
    public static int romanToInt(String s) {
        int number = 0;
        boolean replaced = true;
        while (replaced) {
            replaced = false;
            if (s.contains("IV")) {
                s = s.replace("IV", "");
                number += 4;
                replaced = true;
            } else if (s.contains("IX")) {
                s = s.replace("IX", "");
                number += 9;
                replaced = true;
            } else if (s.contains("XL")) {
                s = s.replace("XL", "");
                number += 40;
                replaced = true;
            } else if (s.contains("XC")) {
                s = s.replace("XC", "");
                number += 90;
                replaced = true;
            } else if (s.contains("CD")) {
                s = s.replace("CD", "");
                number += 400;
                replaced = true;
            } else if (s.contains("CM")) {
                s = s.replace("CM", "");
                number += 900;
                replaced = true;
            }
        }
        for (int i = 0; i < s.length(); ++i) {
            int currentNumber = 0;
            switch (s.charAt(i)) {
                case 'I':
                    currentNumber = 1;
                    break;
                case 'V':
                    currentNumber = 5;
                    break;
                case 'X':
                    currentNumber = 10;
                    break;
                case 'L':
                    currentNumber = 50;
                    break;
                case 'C':
                    currentNumber = 100;
                    break;
                case 'D':
                    currentNumber = 500;
                    break;
                case 'M':
                    currentNumber = 1000;
                    break;
            }
            number += currentNumber;
        }
        return number;
    }
}