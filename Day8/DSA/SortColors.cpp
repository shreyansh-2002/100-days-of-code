Question : -https : // leetcode.com/problems/sort-colors/

Code :-                            
                    
class Solution
{
public:
    void sortColors(vector<int> &nums)
    {
        // by using the 2 pointer approach

        int i = 0;
        int l = 0;
        int j = nums.size() - 1;

        while (l <= j)
        {
            if (nums[l] == 0)
            {
                swap(nums[l], nums[i]);
                i++;
                l++;
            }
            else if (nums[l] == 1)
            {
                l++;
            }
            else
            {
                swap(nums[l], nums[j]);
                j--;
            }
        }
    }
};