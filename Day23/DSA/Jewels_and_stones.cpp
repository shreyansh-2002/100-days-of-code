Question:- https://leetcode.com/problems/jewels-and-stones/description/

Code:- 

class Solution {
public:
    int numJewelsInStones(string jewels, string stones) {
        unordered_set<char> sa(jewels.begin(), jewels.end());

        // here we can't make set of stones because here char frequency matters
        // unordered_set<char> sb(stones.begin(),stones.end());

        int cnt = 0;
        for (auto i : stones) {
            if (sa.count(i) == 1)
                cnt++;
        }

        return cnt;
    }
};  