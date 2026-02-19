Question:- https://www.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621/1


// User function Template for Java

class Solution {
    // Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n) {
        // add your code
        
        HashMap<String,Integer> mp = new HashMap<>();
        
        for(int i = 0;i<n;i++)
        {
            mp.put(arr[i] , mp.getOrDefault(arr[i] , 0) + 1);
        }
        
        String str = "";
        
        int maxcount = Integer.MIN_VALUE;
        
        for(Map.Entry<String,Integer> ele : mp.entrySet())
        {
            if(ele.getValue() > maxcount)
            {
                maxcount = ele.getValue();
                str = ele.getKey();
            }
            else if(ele.getValue() == maxcount)
            {
                if(str.compareTo(ele.getKey()) > 0)
                {
                    str = ele.getKey();
                }
            }
        }
        
        return new String[]{str , Integer.toString(maxcount)};
    }
}
