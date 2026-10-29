package homework.h04;

// advanced
// https://leetcode.com/problems/number-complement/description/
class Solution {
    public int findComplement(int num) {
        int bitLength = 32 - Integer.numberOfLeadingZeros(num);
        int mask = (1 << bitLength) - 1;
        return mask - num;
    }
}