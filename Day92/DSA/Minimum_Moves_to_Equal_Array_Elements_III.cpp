Question:- https://leetcode.com/problems/minimum-moves-to-equal-array-elements-iii/description/

Code:- 

class Solution {
public:
    int minMoves(vector<int>& nums) {\

        int cnt = 0;

        int n = nums.size();

        int highest_element = nums[n-1];

        sort(nums.begin(),nums.end());

        for(int i = 0;i<n-1;i++)
        {
            while(nums[i] != highest_element)
            {
                cnt++;
                nums[i]++;
            }
        }
        
        return cnt;
    }
};