Question:-  https://leetcode.com/problems/most-frequent-even-element/description/


Code:-

class Solution {
public:
    int mostFrequentEven(vector<int>& nums) {
        vector<int> even;

        for (auto i : nums) {
            if (i % 2 == 0) {
                even.push_back(i);
            }
        }

        unordered_map<int, int> mp;
        for (auto i : even) {
            mp[i]++;
        }

        int mostfrequent = 0;
        int ele = -1;
        for (auto i : mp) {
            if (i.second > mostfrequent) {
                mostfrequent = i.second;
                ele = i.first;
            } else if (i.second == mostfrequent && i.first < ele) {
                ele = i.first;
            }
        }

        return ele;
    }
};