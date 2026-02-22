Question:-  https://leetcode.com/problems/find-all-lonely-numbers-in-the-array/description/

Code:-

class Solution {
    public List<Integer> findLonely(int[] nums) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i : nums) {
            int count = mp.getOrDefault(i, 0);
            mp.put(i, count + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> ele : mp.entrySet()) {
            int key = ele.getKey();
            // int value = ele.getValue();

            if (ele.getValue() == 1 && !mp.containsKey(key - 1) && !mp.containsKey(key + 1)) {
                list.add(key);
            }
        }

        return list;
    }
}