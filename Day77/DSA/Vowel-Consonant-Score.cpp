Question:-  https://leetcode.com/problems/vowel-consonant-score/

Code:- 

class Solution {
public:
    int vowelConsonantScore(string s) {
        int v = 0;
        int c = 0;

        for (char ch : s) {
            if (isalpha(ch)) {
                if (isVowel(ch)) {
                    v++;
                } else {
                    c++;
                }
            }
        }

        if (c == 0)
            return 0;


        return v/c;
    }

private:
    bool isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
};