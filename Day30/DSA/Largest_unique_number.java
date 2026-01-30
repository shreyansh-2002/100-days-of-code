Question:- https://neetcode.io/problems/largest-unique-number/question

Code:- 

class Solution {
    public int largestUniqueNumber(int[] nums) {

        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i : nums)
        {
            int count = mp.getOrDefault(i , 0);
            mp.put(i , count + 1);
        }

        int largest = -1;

        for(Map.Entry<Integer,Integer> ele : mp.entrySet())
        {
            if(ele.getValue() == 1)
            {
                largest = Math.max(ele.getKey(),largest);
            }
        }

        return largest;
        
    }
}
