Question:- https://leetcode.com/problems/first-element-with-unique-frequency/description/

Code:-

class Solution {
public:
    int firstUniqueFreq(vector<int>& nums) {

        unordered_map<int,int> mp;
        unordered_map<int,int> mp2;

        int element = -1;

        for(auto i : nums)
        {
            mp[i]++;
        }

        for(auto i : mp)
        {
            mp2[i.second]++;
        }

        for(auto i : nums)
        {
            if(mp2[mp[i]]== 1)
            {
                return i;
            }
        }

        return -1;
    }
};