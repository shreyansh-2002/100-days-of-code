Question:- https://www.geeksforgeeks.org/problems/check-if-divisible-by-114724/1?page=4&category=Strings&difficulty=Basic&sortBy=submissions

Code:- 

    // User function Template for Java

class Sol {
    int divisibleBy11(String S) {
        // Your Code Here
        int sumeven = 0;
        int sumodd = 0;
        
        for(int  i = 0;i<S.length();i++)
        {
            if((i & 1) == 0)
            {
                sumeven += S.charAt(i) - '0';
            }
            else{
                sumodd += S.charAt(i) - '0';
            }
        }
        
        int diff = Math.abs(sumeven-sumodd);
        
        return (diff % 11 == 0) ? 1 : 0;
        
    }
}