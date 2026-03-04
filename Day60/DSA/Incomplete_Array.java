Question:-  https://www.geeksforgeeks.org/problems/incomplete-array3859/1

Code:-

// User function Template for Java

class Solution {
    int countElements(int[] arr) {
        // code here
        int n = arr.length;
        
        int max = arr[0];
        
        int min = arr[0];
        
        for(int i : arr)
        {
            max = Math.max(i,max);
            min = Math.min(i,min);
        }
        
        int total = max - min + 1;
        
        HashSet<Integer> st = new HashSet<>();
        
        for(int i : arr)
        {
            st.add(i);
        }
        
        return total - st.size();
    }
}