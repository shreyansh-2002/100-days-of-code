Question:-  https://leetcode.com/problems/find-the-highest-altitude/

Code:- 

class Solution {
public:
    int largestAltitude(vector<int>& gain) 
    {
        int maxaltitude = 0;
        int current = 0;

        for(int i = 0;i<gain.size();i++)
        {
            current += gain[i];
            maxaltitude = max(current,maxaltitude);
        }

        return maxaltitude;
    }
};