Question:-  https://leetcode.com/problems/most-frequent-even-element/description/

Code:-

class Solution {
    public int mostFrequentEven(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i : nums) 
        {
            if (i % 2 == 0) 
            {
                list.add(i);
            }
        }

        for(int i : list)
        {
            int count = mp.getOrDefault(i,0);
            mp.put(i , count + 1);
        }

        int mostfrequent = 0;
        int element = -1;

        for(Map.Entry<Integer,Integer> ele : mp.entrySet())
        {
            if(ele.getValue() > mostfrequent)
            {
                mostfrequent = ele.getValue();
                element = ele.getKey();
            }
            else if(ele.getValue() == mostfrequent && ele.getKey() < element)
            {
                element = ele.getKey();
            } 
        }

        return element;


    }
}