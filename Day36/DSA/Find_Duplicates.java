Question:-  https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

Code:- 

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i : nums)
        {
            int count = mp.getOrDefault(i,0);
            mp.put(i , count + 1);
        }

        for(Map.Entry<Integer,Integer> ele : mp.entrySet())
        {
            if(ele.getValue() == 2)
            {
                list.add(ele.getKey());
            }
        }

        return list;
    }
}