Question:- https://leetcode.com/problems/find-the-least-frequent-digit/

Code:- 

class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq = new int[10];

        // Count digits
        while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }

        int minFreq = Integer.MAX_VALUE;
        int ans = 0;

        for (int d = 0; d <= 9; d++) {
            if (freq[d] > 0) {
                if (freq[d] < minFreq) {
                    minFreq = freq[d];
                    ans = d;
                } else if (freq[d] == minFreq) {
                    ans = Math.min(ans, d);
                }
            }
        }

        return ans;
    }
}