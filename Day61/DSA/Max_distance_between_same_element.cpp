Question:-  https://www.geeksforgeeks.org/problems/max-distance-between-same-elements/1

Code:-

class Solution {
  public:
    int maxDistance(vector<int> &arr) {
        // Code here
        unordered_map<int,int> mp;
        
        int maxi = 0;
        
        for(int i=0;i<arr.size();i++)
        {
            if(mp.find(arr[i]) == mp.end())
            {
                mp[arr[i]] = i; // first occurrence
            }
            else
            {
                maxi = max(maxi, i - mp[arr[i]]);
            }
        }
        
        return maxi;
    }
};