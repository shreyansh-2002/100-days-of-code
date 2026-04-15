Question:- https://leetcode.com/problems/sort-even-and-odd-indices-independently/description/

Code:- 

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        // separate even index & odd index elements
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }

        Collections.sort(even);

        Collections.sort(odd, Collections.reverseOrder());

        int m = 0, n = 0;

        // put back into original array
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = even.get(m++);
            } else {
                nums[i] = odd.get(n++);
            }
        }

        return nums;
    }
}