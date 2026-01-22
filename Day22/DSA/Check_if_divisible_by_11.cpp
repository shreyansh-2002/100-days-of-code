// User function template for C++
class Solution {
  public:

    int divisibleBy11(string S) {
        // Your Code Here
        int sumeven = 0;
        int sumodd = 0;
        
        for(int  i = 0;i<S.size();i++)
        {
            if((i & 1) == 0)
            {
                sumeven += S[i] - '0';
            }
            else{
                sumodd += S[i] - '0';
            }
        }
        
        int diff = abs(sumeven-sumodd);
        
        return (diff % 11 == 0) ? 1 : 0;
    }
};