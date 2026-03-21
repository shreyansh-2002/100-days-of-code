Question:- https://leetcode.com/problems/absolute-difference-between-maximum-and-minimum-k-elements/description/


Code:- 

class Solution {
public:
    int absDifference(vector<int>& nums, int k) {
        
        sort(nums.begin(), nums.end());

        int n = nums.size();

        int smallsum = 0;
        int largesum = 0;

        for (int i = 0; i < k; i++) {
            smallsum += nums[i];
        }

        for (int i = n - k; i < n; i++) {
            largesum += nums[i];
        }

        return abs(largesum - smallsum);
    }
};