Question:-  https://leetcode.com/problems/find-common-elements-between-two-arrays/

Code:-

class Solution {
public:
    vector<int> findIntersectionValues(vector<int>& nums1, vector<int>& nums2) {

        unordered_set<int> st1;
        unordered_set<int> st2;

        for (int i : nums1) {
            st1.insert(i);
        }

        for (int i : nums2) {
            st2.insert(i);
        }

        int answer1 = 0;
        int answer2 = 0;

        vector<int> ans;

        for (int i : nums1) {
            if (st2.find(i) != st2.end()) {
                answer1++;
            }
        }

        for (int i : nums2) {
            if (st1.find(i) != st1.end()) {
                answer2++;
            }
        }

        ans.emplace_back(answer1);
        ans.emplace_back(answer2);

        return ans;
    }
};