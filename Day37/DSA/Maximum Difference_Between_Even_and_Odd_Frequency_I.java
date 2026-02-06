Question:- https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/description/

Code:- 

class Solution {
    public int maxDifference(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        int oddmax = 0;
        int evenmin = Integer.MAX_VALUE;

        for(char i : s.toCharArray())
        {
            int count = map.getOrDefault(i , 0);
            map.put(i , count + 1);
        }

        for(Map.Entry<Character,Integer> ele : map.entrySet())
        {
            if(ele.getValue() % 2 == 0)
            {
                evenmin = Math.min(evenmin,ele.getValue());
            }
            else{
                oddmax = Math.max(oddmax,ele.getValue());
            }
        }

        return (oddmax - evenmin);
    }
}