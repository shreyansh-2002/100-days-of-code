Question:-  https://www.geeksforgeeks.org/problems/max-distance-between-same-elements/1

Code:-

class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        HashMap<Integer,Integer> mp = new HashMap<>();
        
        int maxi = 0;
        
        for(int i = 0;i<arr.length;i++)
        {
            if(!mp.containsKey(arr[i]))
            {
                mp.put(arr[i],i);
            }
            else
            {
                maxi = Math.max(maxi , i - mp.get(arr[i]));
            }
        }
        
        return maxi;
    }
}