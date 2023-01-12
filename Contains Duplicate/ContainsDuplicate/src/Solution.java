import java.util.Set;
import java.util.HashSet;

public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        if (nums.length == 0)
            return false;

        Set<Integer> numbersSet = new HashSet<>();

        for (int num : nums) {
            if (numbersSet.contains(num))
                return true;
            numbersSet.add(num);
        }

        return false;
    }
}