Question:- https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

Code:- 

class Solution {
    public int findNumbers(int[] nums) {

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int counteven = 0;

            while (temp > 0) {
                temp = temp / 10;

                counteven = counteven + 1;
            }

            if ((counteven & 1) == 0) {
                ans++;
            }

        }

        return ans;
    }
}