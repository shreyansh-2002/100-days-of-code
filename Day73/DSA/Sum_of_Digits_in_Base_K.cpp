Question:- https://leetcode.com/problems/sum-of-digits-in-base-k/description/?envType=problem-list-v2&envId=math

Code:-

class Solution {
public:
    int sumBase(int n, int k) {
        int sum=0;
        while(n>0){
            int digit=n%k;
            cout<<digit<<" ";
            sum+=digit;
            n=n/k;
        }
        return sum;
    }
};