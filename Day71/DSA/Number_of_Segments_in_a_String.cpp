Question:- https://leetcode.com/problems/number-of-segments-in-a-string/description/?envType=problem-list-v2&envId=string

Code:-

class Solution {
public:
    int countSegments(string s) {
        
        int cnt = 0;

        for(int i = 0;i<s.size();i++)
        {
            if(s[i] != ' ' && (i == 0 || s[i-1] == ' '))
            {
                cnt++;
            }
        }

        return cnt;
    }
};