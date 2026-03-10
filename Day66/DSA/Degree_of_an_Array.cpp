Question:- https://leetcode.com/problems/degree-of-an-array/description/

Code:-

class Solution {
public:
    int findShortestSubArray(vector<int>& nums) {
        
        unordered_map<int,int> freq;

        unordered_map<int,int> first;

        unordered_map<int,int> last;

        int degree = 0;
        int ans = nums.size();


        for(int i = 0;i<nums.size();i++)
        {
            if(first.count(nums[i]) == 0)
            {
                first[nums[i]] = i;
            }

            last[nums[i]] = i;

            freq[nums[i]]++;

            degree = max(degree , freq[nums[i]]);
        }

        // int ans = nums.size();

        for(auto p : freq)
        {
            if(p.second == degree)
            {
                int num = p.first;
                ans = min(ans , last[num] - first[num] + 1);
            }
        }

        return ans;
    }
};