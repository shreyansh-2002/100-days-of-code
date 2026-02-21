Question:-  https://leetcode.com/problems/monotonic-array/description/?envType=problem-list-v2&envId=array


Code:-

class Solution {
public:
    bool isMonotonic(vector<int>& nums) {
        
        bool inc  = true;
        bool dec = true;

        for(int i = 0;i<nums.size()-1;i++)
        {
            if(nums[i] < nums[i+1])
            {
                inc = false;
            }
            else if(nums[i] > nums[i+1])
            {
                dec = false;
            }
        }

        return inc || dec;
    }
};