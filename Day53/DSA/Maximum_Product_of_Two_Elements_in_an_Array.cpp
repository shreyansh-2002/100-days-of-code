Question:-  https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/


Code:-

class Solution {
public:
    int maxProduct(vector<int>& nums) {

        priority_queue<int> pq;

        for (int i : nums) {
            pq.push(i);
        }

        int x = pq.top();
        pq.pop();
        int y = pq.top();

        return (x - 1) * (y - 1);
    }
};