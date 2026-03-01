Question:-  https://leetcode.com/problems/find-the-pivot-integer/description/?envType=problem-list-v2&envId=maths-m1-arithmetic-basic-reasoning

Code:-

class Solution {
    public int pivotInteger(int n) {
        
        int s1 = 0;
        int s2 = 0;

        for(int i = n;i>=1;i--)
        {
            s1 = i*(i+1)/2;
            
            s2 += i;

            if(s1 == s2)
            {
                return i;
            }
        }

        return -1;
    }
}