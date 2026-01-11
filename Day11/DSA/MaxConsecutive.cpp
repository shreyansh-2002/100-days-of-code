Code:- 

class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int max_no = 0, count = 0;
        for (int i = 0 ; i < nums.size(); i++) {
            if (nums[i] == 1) {
                count++;
                max_no = max(max_no, count);
            } else {
                count = 0;
            }
        }
        return max_no;
    }
};