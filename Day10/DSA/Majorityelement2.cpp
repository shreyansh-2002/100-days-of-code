Question:- https://leetcode.com/problems/majority-element-ii/

class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        unordered_map<int, int> mp;
        vector<int> v;
        for (auto x : nums) {
            mp[x]++;
        }
        for (auto i : mp) {
            if (i.second > nums.size() / 3)
                v.push_back(i.first);
        }
        return v;
    }
};