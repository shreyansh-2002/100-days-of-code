Question:-  https://www.geeksforgeeks.org/problems/find-repetitive-element-from-1-to-n-1/1

Code:-

// User function Template for Java
class Solution {
    public int findDuplicate(int[] arr) {
        // code here
        HashMap<Integer , Integer> mp = new HashMap<>();
        
        for(int i : arr)
        {
            int count = mp.getOrDefault(i,0);
            mp.put(i , count + 1);
        }
        
        int rep = 0 ;
        
        for(Map.Entry<Integer,Integer> ele : mp.entrySet())
        {
            if(ele.getValue() > 1)
            {
                rep =  ele.getKey();
            }
        }
        
        return rep;
    }
}