package homework.h04;

// base
// https://leetcode.com/problems/hamming-distance/description/
class Solution {
    public int hammingDistance(int x, int y) {
        int c=0;
        int dif=x^y;
        while(dif!=0){
            c+=dif & 1;
            dif>>=1;
        }
        return c;
    }
}