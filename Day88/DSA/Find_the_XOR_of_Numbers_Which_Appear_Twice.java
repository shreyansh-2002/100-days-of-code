Question:- https://leetcode.com/problems/find-the-xor-of-numbers-which-appear-twice/

Code:- 

class Solution {
    public int duplicateNumbersXOR(int[] nums) {

        HashMap<Integer,Integer> mp = new HashMap<>();

        for (int i : nums) {
            int count = mp.getOrDefault(i,0);
            mp.put(i , count+1);
        }

        int ans = 0;

        for(Map.Entry<Integer, Integer> ele : mp.entrySet() )
        {
            int key = ele.getKey();
            int val = ele.getValue();

            if(val == 2)
            {
                ans ^= key;
            }
        }

        return ans;
    }
}