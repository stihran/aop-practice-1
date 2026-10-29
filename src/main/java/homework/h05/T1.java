package homework.h05;

// base
// https://leetcode.com/problems/maximum-product-difference-between-two-pairs/description/
class Solution {
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int lowLow = nums[0];
        int lowHigh = nums[1];
        int highLow = nums[n - 2];
        int highHigh = nums[n - 1];

        return (highLow * highHigh) - (lowLow * lowHigh);
    }
}