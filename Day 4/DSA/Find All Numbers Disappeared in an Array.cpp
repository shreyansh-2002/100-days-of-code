question : -https : // leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/?envType=problem-list-v2&envId=dsa-linear-shoal-array-ii

                    
class Solution
{
public:
    vector<int> findDisappearedNumbers(vector<int> &nums)
    {
        int n = nums.size();
        vector<int> hash(n + 1, 0);
        for (int i = 0; i < n; i++)
        {
            hash[nums[i]]++;
        }

        vector<int> v;
        for (int i = 1; i <= n; i++)
        {
            if (hash[i] == 0)
                v.push_back(i);
        }

        return v;
    }
};