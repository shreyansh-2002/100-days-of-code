Question:-  https://leetcode.com/problems/counting-words-with-a-given-prefix/

Code:- 

class Solution {
public:
    int prefixCount(vector<string>& words, string pref) {
        int cnt = 0;
        int n = pref.size();
        for(int i = 0;i<words.size();i++)
        {
            if(words[i].substr(0,n) == pref)
            {
                cnt++;
            }
        }

        return cnt;
    }
};