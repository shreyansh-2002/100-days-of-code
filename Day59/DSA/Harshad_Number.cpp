Question:- https://leetcode.com/problems/harshad-number/description/

Code:- 

class Solution {
public:
    int sumOfTheDigitsOfHarshadNumber(int n) {
        
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            sum = sum + temp % 10;
            temp = temp / 10;
        }
        if (n % sum == 0)
            return sum ;
        else
            return -1;
    }
};