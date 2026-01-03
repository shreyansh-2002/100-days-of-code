
Question : -https : // leetcode.com/problems/group-anagrams/description/

                    
class Solution
{
public:
    vector<vector<string>> groupAnagrams(vector<string> &strs)
    {
        unordered_map<string, vector<string>> mp;

        for (auto i : strs)
        {
            string str = i;
            sort(str.begin(), str.end());
            mp[str].push_back(i);
        }

        vector<vector<string>> v;
        for (auto i : mp)
        {
            v.push_back(i.second);
        }

        return v;
    }
};
