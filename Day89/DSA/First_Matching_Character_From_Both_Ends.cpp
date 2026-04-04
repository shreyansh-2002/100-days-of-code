Question:- https://leetcode.com/problems/first-matching-character-from-both-ends/description/

Code:- 

class Solution {
public:
    int firstMatchingIndex(string s) {

        int idx = -1;

        int n = s.size();

        for(int i = 0;i<s.size();i++)
        {
            if(s[i] == s[n-i-1])
            {
                idx = i;
                break;
            }
        }

        return idx;
    }
};