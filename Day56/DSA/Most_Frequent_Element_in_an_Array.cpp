Question:-  https://www.geeksforgeeks.org/problems/most-frequent-element-in-an-array/1

Code:-

    class Solution {
      public:
        int mostFreqEle(vector<int>& arr) {
            // code here
            unordered_map<int,int> mp;
            
            for(auto i : arr)
            {
                mp[i]++;
            }
            
            int mostfrequent = 0;
            int ele = INT_MIN;
            
            for(auto i : mp)
            {
                if(i.second > mostfrequent)
                {
                    mostfrequent = i.second;
                    ele = i.first;
                }
                else if(mostfrequent == i.second && i.first > ele)
                {
                    ele = i.first;
                }
            }
            
            return ele;
        }
    };