package Day1.DSA;
Question:- https://leetcode.com/problems/set-mismatch/

class Solution {
    public int[] findErrorNums(int[] nums) {

        int n = nums.length;

        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();

        ArrayList<Integer> list = new ArrayList<Integer>();

        int sum = 0;

        for (int i : nums) {
            int count = mp.getOrDefault(i, 0);
            mp.put(i, count + 1);

            sum += i;
        }

        for (Map.Entry<Integer, Integer> ele : mp.entrySet()) {
            if (ele.getValue() == 2) {
                list.add(ele.getKey());
            }
        }

        int missing = n * (n + 1) / 2 - (sum - list.get(0));

        list.add(missing);

        int arr[] = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;

    }
}
