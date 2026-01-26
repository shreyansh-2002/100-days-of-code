Code:- 

class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        unordered_map<int, int> mp;
        for (auto i : ransomNote) {
            mp[i]++;
        }
        for (auto x : magazine) {
            mp[x]--;
        }

        for (auto i : mp) {
            if (i.second > 0)
                return false;
        }
        return true;
    }
};