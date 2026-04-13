Question:- https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/description/?envType=problem-list-v2&envId=array

Code:- 

class Solution {
    public int countElements(int[] nums) {

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;


        for(int num : nums) {
            mini = Math.min(mini, num);
            maxi = Math.max(maxi, num);
        }

        int cnt = 0;

        for(int num : nums)
        {
            if(num > mini && num < maxi)
            {
                cnt++;
            } 
        }

        return cnt;

    }
}
