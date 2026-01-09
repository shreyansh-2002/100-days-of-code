class Solution
{
public:
    int majorityElement(vector<int> &nums)
    {
        unordered_map<int, int> mp;
        int majority;
        for (auto i : nums)
        {
            mp[i]++;
        }
        for (auto x : mp)
        {
            if (x.second > nums.size() / 2)
                majority = x.first;
        }
        return majority;
    }
};