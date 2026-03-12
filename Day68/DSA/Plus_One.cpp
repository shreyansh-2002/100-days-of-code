Question:- https://leetcode.com/problems/plus-one/description/?envType=problem-list-v2&envId=array

Code:- 

class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {

        int n = digits.size();

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        vector<int> results(n + 1, 0);
        results[0] = 1;

        return results;
    }
};