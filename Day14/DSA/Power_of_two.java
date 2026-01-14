Question:- https://leetcode.com/problems/power-of-two/

Code:- 

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0)
        {
            return false;
        }

        return (n & (n-1)) == 0;
    }
}
