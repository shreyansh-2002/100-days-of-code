Question:- https://leetcode.com/problems/take-gifts-from-the-richest-pile/description/

Code:- 
class Solution {
public:
    long long pickGifts(vector<int>& gifts, int k) {
        priority_queue<long long> pq;

        for(auto i : gifts)
        {
            pq.push(i);
        }

        while(k--)
        {
            long long x = pq.top();
            pq.pop();
            pq.push(floor(sqrt(x)));
        }

        long long ans = 0;
        while(!pq.empty())
        {
            ans += pq.top();
            pq.pop();
        }

        return ans;
    }
};