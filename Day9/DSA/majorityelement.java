Question:- https://leetcode.com/problems/majority-element/description/

Code:- 

class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        int res = 0;

        for(int i : nums)
        {
            int count = map.getOrDefault(i,0);
            map.put(i , count + 1);
        }

        for(Map.Entry<Integer,Integer> element : map.entrySet())
        {
            if(element.getValue() > n/2)
            {
                res = element.getKey();
            }
        }

        return res;
    }
}