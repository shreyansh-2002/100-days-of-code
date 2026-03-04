Question:-  https://www.geeksforgeeks.org/problems/incomplete-array3859/1

Code:-

// User function template for C++

class Solution {
  public:
    int countElements(vector<int> &arr) {
        // code here
        
        int n = arr.size();
        
        int maxi = arr[0];
        
        int mini = arr[0];
        
        for(int i = 0;i<arr.size();i++)
        {
            maxi = max(maxi,arr[i]);
        }
        
        for(int i = 0;i<arr.size();i++)
        {
            mini = min(mini,arr[i]);
        }
        
        unordered_set<int> s(arr.begin(), arr.end());
        
        int total = maxi - mini + 1;
        
        return total - s.size();
    }
};