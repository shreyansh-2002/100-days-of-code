Question:-   https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/

Code:-  

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";

        for(String i : word1)
        {
            s1 += i;
        }

        System.out.println(s1);

        String s2 = "";

        for(String i : word2)
        {
            s2 += i;
        }

        System.out.println(s2);

        return s1.equals(s2);
    }
}