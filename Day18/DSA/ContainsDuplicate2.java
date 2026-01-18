Question:- https://leetcode.com/problems/contains-duplicate-ii/

Code:- 

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();

        for(int i = 0;i<nums.length;i++)
        {
            if(mp.containsKey(nums[i]) && Math.abs(i - mp.get(nums[i])) <= k)
            {
                return true;
            }

            mp.put(nums[i] , i);
        }

        return false;
    }
}