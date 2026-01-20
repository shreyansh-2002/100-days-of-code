class Solution {
public:
    int subtractProductAndSum(int n) {
        
        int i = 0;
        int prod = 1;
        
        int sum = 0;

        while(n > 0)
        {
            int digit = n % 10;
            n /= 10;

            prod *= digit;
            sum += digit;
        }

        return prod - sum;
    }
};