Question:-  https://www.geeksforgeeks.org/problems/most-frequent-element-in-an-array/1

Code:- 

class Solution {
    public int mostFreqEle(int[] arr) {
        // code here
        HashMap<Integer,Integer> mp = new HashMap<>();
        
        for(int i : arr)
        {
            int count = mp.getOrDefault(i,0);
            mp.put(i , count + 1);
        }
        
        int maxfreq = 0;
        
        int maxele = Integer.MIN_VALUE;
        
        for(Map.Entry<Integer,Integer> ele : mp.entrySet())
        {
            if(ele.getValue() > maxfreq)
            {
                maxfreq = ele.getValue();
                maxele = ele.getKey();
            }
            else if(ele.getValue() == maxfreq && ele.getKey() > maxele)
            {
                maxele = ele.getKey();
            }
        }
        
        return maxele;
    }
}