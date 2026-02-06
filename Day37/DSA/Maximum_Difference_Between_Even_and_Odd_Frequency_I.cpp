Question:- https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/description/


Code:- 

class Solution {
public:
    int maxDifference(string s) {
        int oddmax = 0;
        int evenmin = INT_MAX;

        unordered_map<char,int> mp;

        for(auto i : s)
        {
            mp[i]++;
        }

        for(auto i : mp)
        {
            if(i.second & 1)
            {
                oddmax = max(oddmax,i.second);
            }
            else
            {
                evenmin = min(evenmin,i.second);
            }
        }

        return oddmax - evenmin;
    }
};