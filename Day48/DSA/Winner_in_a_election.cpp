Question:- https://www.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621/1

Code:- 

class Solution {
  public:

    // Function to return the name of candidate that received maximum votes.
    vector<string> winner(string arr[], int n) {
        // Your code here
        unordered_map<string , int> mp;
        
        for(int i = 0; i < n; i++)
        {
            mp[arr[i]]++;
        }
        
        int maxcount = INT_MIN;
        
        string str = "";
        
        for(auto i : mp)
        {
            if(i.second > maxcount)
            {
                maxcount = i.second;
                str = i.first;
            }
            else if(i.second == maxcount)
            {
                str = min(i.first,str);
            }
        }
        
        return {str , to_string(maxcount)};
        
        // Return the string containing the name and an integer
        // representing the number of votes the winning candidate got
    }
};