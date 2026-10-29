package homework.h01;

// advanced
// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
class Solution {
    public int countOdds(int low, int high) {
        return (high+(high&1)-low+(low&1))>>1;
    }
}