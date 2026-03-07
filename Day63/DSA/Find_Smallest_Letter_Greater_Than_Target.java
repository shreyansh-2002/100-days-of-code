Question:-  https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/?envType=problem-list-v2&envId=array


Code:- 

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        for(int i = 0;i<letters.length;i++)
        {
            if(letters[i] > target)
            {
                return letters[i];
            }
        }

        return letters[0];
    }
}