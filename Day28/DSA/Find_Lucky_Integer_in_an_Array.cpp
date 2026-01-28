class Solution {
public:
    int findLucky(vector<int>& arr) {
        unordered_map<int,int> mp;

        for(auto i : arr)
        {
            mp[i]++;
        }

        int lucky = -1;
        for(auto i : mp)
        {
            if(i.first == i.second)
            lucky = max(i.first,lucky);
        }

        return lucky;
    }
};