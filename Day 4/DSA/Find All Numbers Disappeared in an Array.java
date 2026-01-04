Question:- https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/?envType=problem-list-v2&envId=dsa-linear-shoal-array-ii

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        ArrayList<Integer> list = new ArrayList<Integer>();

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i : nums) {
            set.add(i);
        }

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }

        return list;
    }
}