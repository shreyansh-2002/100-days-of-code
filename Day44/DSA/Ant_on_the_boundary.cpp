Question:-  class Solution {
public:
    int returnToBoundaryCount(vector<int>& nums) {
        int count = 0;
        int boundary = 0;

        for(auto i : nums)
        {
            boundary += i;
            if(boundary == 0)
            {
                count++;
            }
        }

        return count;
    }
};