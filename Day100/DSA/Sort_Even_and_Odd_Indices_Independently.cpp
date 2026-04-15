Question:- https://leetcode.com/problems/sort-even-and-odd-indices-independently/description/

Code:- 

class Solution {
public:
    vector<int> sortEvenOdd(vector<int>& nums) {
        vector<int> even, odd;
        vector<int> res;
        for (int i = 0; i < nums.size(); i++) {
            if (i % 2 == 0) {
                even.push_back(nums[i]);
            } else {
                odd.push_back(nums[i]);
            }
        }
        sort(even.begin(), even.end());
        sort(odd.rbegin(), odd.rend());
        
        int m = 0, n = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (i % 2 == 0) {
                nums[i] = even[m++];
            } else {
                nums[i] = odd[n++];
            }
        }

        return nums;
    }
};