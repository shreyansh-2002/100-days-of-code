Question:-  https://leetcode.com/problems/find-words-containing-character/description/


Code:-  

class Solution {
public:
    vector<int> findWordsContaining(vector<string>& words, char x) {
        vector<int> v;

        int n = words.size();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < words[i].size(); j++) {
                if (words[i][j] == x) {
                    v.push_back(i);
                    break;
                }
            }
        }

        return v;
    }
};