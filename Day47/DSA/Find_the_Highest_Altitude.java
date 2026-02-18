Question:-  https://leetcode.com/problems/find-the-highest-altitude/description/

Code:-

class Solution {
    public int largestAltitude(int[] gain) 
    {
        int maxaltitude = 0;
        int current = 0;

        for(int i = 0;i<gain.length;i++)
        {
            current += gain[i];
            maxaltitude = Math.max(current,maxaltitude);
        }

        return maxaltitude;
    }
}