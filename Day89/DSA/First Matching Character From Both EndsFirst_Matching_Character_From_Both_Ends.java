Question:- https://leetcode.com/problems/first-matching-character-from-both-ends/\

Code:- 

class Solution {
    public int firstMatchingIndex(String s) {
        int idx = -1;

        int n = s.length();

        for(int i = 0;i<n;i++)
        {
            if(s.charAt(i) == s.charAt(n-i-1))
            {
                idx = i;
                break;
            }
        }

        return idx;
    }
}