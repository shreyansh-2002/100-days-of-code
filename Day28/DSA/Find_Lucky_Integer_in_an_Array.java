Question:-  https://leetcode.com/problems/find-lucky-integer-in-an-array/description/

Code:-  

class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            int count = map.getOrDefault(i, 0);
            map.put(i, count + 1);
        }

        int lucky = -1;

        for (Map.Entry<Integer, Integer> ele : map.entrySet()) {
            if (ele.getKey() == ele.getValue()) {
                lucky = Math.max(ele.getKey(), lucky);
            }
        }
        
        return lucky;
    }
}