Question:- https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/description/?envType=problem-list-v2&envId=array

Code:- 

class Solution {
public:
    int countElements(vector<int>& nums) {

        int mini = INT_MAX;
        int maxi = INT_MIN;

        // find min and max
        for(int num : nums) {
            mini = min(mini, num);
            maxi = max(maxi, num);
        }

        int cnt = 0;

        // count elements strictly between min and max
        for(int num : nums) {
            if(num > mini && num < maxi) {
                cnt++;
            }
        }

        return cnt;
    }
};