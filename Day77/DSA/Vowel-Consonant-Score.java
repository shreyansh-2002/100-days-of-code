Question:- https://leetcode.com/problems/vowel-consonant-score/

Code:- 

class Solution {
public:
    int vowelConsonantScore(string s) {
        int v = 0;
        int c = 0;

        for (int i = 0; i < s.size() - 1; i++) {
            if (isalpha(s[i])) {
                if (isVowel(s[i])) {
                    v++;
                } else {
                    c++;
                }
            }
        }

        if (c == 0)
            return 0;
    }

private:
    bool isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
};
