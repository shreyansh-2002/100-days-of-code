class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i : nums) {
            int count = map.getOrDefault(i, 0);
            map.put(i, count + 1);
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (Map.Entry<Integer, Integer> ele : map.entrySet()) {
            if (ele.getValue() > n / 3) {
                list.add(ele.getKey());
            }
        }

        // int arr[] = new int[list.size()];

        // for (int i = 0; i < list.size(); i++) {
        //     arr[i] = list.get(i);
        // }

        // return arr;

        return list;

    }
}