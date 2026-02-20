Question:- https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1?page=1&category=Hash&difficulty=Basic&sortBy=submissions

Code:- 

class Solution {
  public:
    // Function to check if b is a subset of a
    bool isSubset(vector<int> &a, vector<int> &b) {
        // Your code here
        unordered_map<int,int> mp;
        
        for(auto i : a)
        {
            mp[i]++;
        }
        
        for(auto i : b)
        {
            if(mp[i] > 0)
            {
                mp[i]--;
            }
            else
            {
                return false;
            }
        }
        
        return true;
    }
};