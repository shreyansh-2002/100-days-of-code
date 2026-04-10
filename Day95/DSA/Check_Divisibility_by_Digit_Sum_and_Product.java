Question:- https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/description/

Code:- 

class Solution {
    public boolean checkDivisibility(int n) {

        int sum = 0, product = 1, c = n;

        while(n > 0) 
        {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }

        return c % (sum + product) == 0;
    }
}