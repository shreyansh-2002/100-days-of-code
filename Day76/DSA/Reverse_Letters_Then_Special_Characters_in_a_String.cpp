Question:- https://leetcode.com/problems/reverse-letters-then-special-characters-in-a-string/description/

Code:- 

class Solution {
public:
    string reverseByType(string s) {
        int i = 0;
        int j = s.size() - 1;

        while (i < j) {
            if ((isalpha(s[i])) && (isalpha(s[j]))) {
                swap(s[i], s[j]);
                i++;
                j--;
            } else if (!isalpha(s[i])) {
                i++;
            } else if (!isalpha(s[j])) {
                j--;
            }
        }

        i = 0;
        j = s.size() - 1;

        while (i < j) {
            if ((!isalpha(s[i])) && (!isalpha(s[j]))) {
                swap(s[i], s[j]);
                i++;
                j--;
            } else if (isalpha(s[i])) {
                i++;
            } else if (isalpha(s[j])) {
                j--;
            }
        }
        return s;
    }
};