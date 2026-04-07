Question:- https://leetcode.com/problems/minimum-moves-to-equal-array-elements-iii/

Code:- 

class Solution {
    public int minMoves(int[] nums) {

        int cnt = 0;

        int n = nums.length;

        Arrays.sort(nums);
        int highest_element = nums[n - 1];

        for (int i = 0; i < n - 1; i++) {
            while (nums[i] != highest_element) {
                cnt++;
                nums[i]++;
            }
        }

        return cnt;
    }
}