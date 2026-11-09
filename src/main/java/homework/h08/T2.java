package homework.h08;

// base
// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/
public class Solution {
    public int countPairs(List<Integer> nums, int target) {
        nums.sort((a, b) -> Integer.compare(a, b));

        int low = 0;
        int high = nums.size() - 1;
        int c = 0;

        while (low < high) {
            if (nums.get(low) + nums.get(high) < target) {
                c += (high - low);
                low++;
            } else
                high--;
            }
        }

        return c;
    }
}