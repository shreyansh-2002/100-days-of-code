Question:-  https://leetcode.com/problems/find-missing-and-repeated-values/description/

Code:- 

class Solution {
public:
    vector<int> findMissingAndRepeatedValues(vector<vector<int>>& grid) {
        int sum = 0;
        int orisum = 0;
        unordered_map<int, int> mp;
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid[i].size(); j++) {
                mp[grid[i][j]]++;
                sum += grid[i][j];
            }
        }
        //  cout<<sum<<endl;;

        vector<int> v;
        for (auto i : mp) {
            if (i.second == 2)
                v.push_back(i.first);
        }

        // for (int i = ; i < grid.size() * grid.size(); i++) {
        //     orisum += i;
        // }

        int n = grid.size()*grid.size();

        orisum = ((n*n) + n)/2;

        // cout<<orisum;

        v.push_back(orisum - sum + v[0]);
        return v;
    }
};