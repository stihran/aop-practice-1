package homework.h08;

// base
// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/
public class Solution {
    public int countPairs(List<Integer> nums, int target) {
        // 0 <= i < j < n
        // It just means don't take the same index and don't count the same pair twice
        // (pairing index 0 with index 2 is the same as pairing index 2 with index 0).
        nums.sort((a, b) -> Integer.compare(a, b));

        int low = 0;
        int high = nums.size() - 1;
        int c = 0;

        while (low < high) {
            if (nums.get(low) + nums.get(high) < target) {
                // All elements from low+1 to high form a valid pair with nums[low]
                c += (high - low);
                low++;
            } else {
                // Sum is too big, try a smaller number from the right
                high--;
            }
        }

        return c;
    }
}