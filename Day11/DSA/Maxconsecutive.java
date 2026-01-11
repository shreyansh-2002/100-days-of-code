Question :-  https://leetcode.com/problems/max-consecutive-ones/description/?envType=problem-list-v2&envId=dsa-linear-shoal-array-i

Code:-

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count, max_no;
        count = 0;
        max_no = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                max_no = Math.max(max_no, count);
            } else {
                count = 0;
            }
        }

        return max_no;
    }
}