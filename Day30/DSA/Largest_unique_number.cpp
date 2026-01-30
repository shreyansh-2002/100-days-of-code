Code:- 

class Solution {
public:
    int largestUniqueNumber(vector<int>& nums) {
        unordered_map<int,int> mp;

        for(auto i : nums)
        {
            mp[i]++;
        }

        int largest  = -1;

        for(auto i : mp)
        {
            if(i.second == 1)
            {
                largest  = max(i.first,largest);
            }
        }

        return largest;


    }
};
