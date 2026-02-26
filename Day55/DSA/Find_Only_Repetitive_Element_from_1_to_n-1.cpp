Question:-  https://www.geeksforgeeks.org/problems/find-repetitive-element-from-1-to-n-1/1

Code:- 

// User function Template for C++
class Solution {
  public:
    int findDuplicate(vector<int>& arr) {
        // code here
        unordered_map<int,int> mp;
        
        for(auto i : arr)
        {
            mp[i]++;
        }
        
        for(auto i : mp)
        {
            if(i.second > 1)
            {
                return i.first;
            }
        }
    }
};