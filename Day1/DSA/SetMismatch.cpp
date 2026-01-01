Question : -https: // leetcode.com/problems/set-mismatch/

class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        unordered_map<int, int> mp;
        long long sum = 0;
        for (auto i : nums) {
            mp[i]++;
            sum += i;
        }

        vector<int> v;
        int repeat ;
        for (auto i : mp) {
            if (i.second == 2) {
                repeat = i.first;
                v.push_back(i.first);
            }
        }

        int n = nums.size();
        int orisum = (n * (n + 1)) / 2;
        int miss = orisum - (sum - repeat);
        v.push_back(miss);

        return v;
    }
};