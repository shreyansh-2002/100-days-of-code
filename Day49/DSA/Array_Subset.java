Question:- https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1?page=1&category=Hash&difficulty=Basic&sortBy=submissions


Code:- 


class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer> mp = new HashMap<>();
        
        for(int i : a)
        {
            mp.put(i , mp.getOrDefault(i,0) + 1);
        }
        
        for(int i : b)
        {
            if(mp.containsKey(i) && mp.get(i) > 0)
            {
                mp.put(i , mp.get(i) - 1);
            }
            else{
                return false;
            }
        }
        
        return true;
    }
}
