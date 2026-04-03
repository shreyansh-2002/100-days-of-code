Question:- https://leetcode.com/problems/find-the-xor-of-numbers-which-appear-twice/description/

Code:- 

class Solution {
public:
    int duplicateNumbersXOR(vector<int>& nums) {
        unordered_map<int, int> mp;
        for (auto i : nums) {
            mp[i]++;
        }

        int ans = 0;
        for (auto i : mp) {
            if (i.second == 2) {
                ans = ans ^ i.first;
            }
        }

        return ans;
    }
};