Question:- https://leetcode.com/problems/ant-on-the-boundary/description/

Code:- 

class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count = 0;
        int boundary = 0;

        for(int i : nums)
        {
            boundary += i;
            if(boundary == 0)
            {
                count++;
            }
        }

        return count;
    }
}