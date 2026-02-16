Question:-  https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/

Code:- 

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder strbld = new StringBuilder();

        for(int i = 0;i<words.size();i++)
        {
            strbld.append(words.get(i).charAt(0));
        }

        return s.equals(strbld.toString());
    }
}