Question : -https: // leetcode.com/problems/two-sum/description/

Code:- 

*************Brute force approach***************
T.C. :- O(n^2)

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums[i] + nums[j] == target)
                    return {i, j};
            }
        }
        return {};
    }
};

**************Optimised Solution*******************
T.C. :- O(n)

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> mp;

        for (int i = 0; i < nums.size(); i++) {
            int needed = target - nums[i];
            if (mp.count(needed)) {
                return {mp[needed], i};
            }

            mp[nums[i]] = i;
        }

        return {};
    }
};
