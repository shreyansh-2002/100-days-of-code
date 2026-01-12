Question:- https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/


class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int ans = 0;
        for (int i = 0; i < nums.size(); i++) {
            int n = nums[i];
            int c = 0;
            while (n > 0) {
                n = n / 10;
                c++;
            }
            if (c % 2 == 0) {
                ans++;
            }
        }

        return ans;
    }
};