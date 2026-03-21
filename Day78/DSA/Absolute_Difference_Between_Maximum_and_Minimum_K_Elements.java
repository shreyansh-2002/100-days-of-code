Question:- https://leetcode.com/problems/absolute-difference-between-maximum-and-minimum-k-elements/description/

Code:- 

class Solution {
    public int absDifference(int[] nums, int k) {

        Arrays.sort(nums);

        int n = nums.length;

        int smallsum = 0;
        int largesum = 0;

        for (int i = 0; i < k; i++) {
            smallsum += nums[i];
        }

        for (int i = n-k; i < n; i++) {
            largesum += nums[i];
        }

        return Math.abs(largesum - smallsum);
    }
}