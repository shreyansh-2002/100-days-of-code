Question:- https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/description/

Code:- 

class Solution {
    public int countPairs(int[] nums, int k) {
        if (nums.length == 1)
            return 0;

        int cnt = 0;
        for (int i = 0; i <= nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0)
                    cnt++;
            }
        }

        return cnt;
    }
}