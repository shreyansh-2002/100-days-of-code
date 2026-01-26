Question:- https://leetcode.com/problems/ransom-note/

Code:- 

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char i : ransomNote.toCharArray())
        {
            int count = map.getOrDefault(i , 0);
            map.put(i , count + 1);
        }

        for(char j : magazine.toCharArray())
        {
            int count = map.getOrDefault(j , 0);
            map.put(j , count - 1);
        }

        for(Map.Entry<Character, Integer> ele : map.entrySet())
        {
            if(ele.getValue() > 0)
            {
                return false;
            }
        }

        return true;

    }
}