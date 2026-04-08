Question:- https://leetcode.com/problems/total-waviness-of-numbers-in-range-i/

Code:- 

class Solution {
    public int totalWaviness(int num1, int num2) {

        int waviness = 0;

        for (int i = Math.max(100, num1); i <= num2; i++) {

            String s = String.valueOf(i);

            for (int j = 1; j < s.length() - 1; j++) {

                if ((s.charAt(j - 1) < s.charAt(j)) && (s.charAt(j) > s.charAt(j + 1)) ||
                        (s.charAt(j - 1) > s.charAt(j) && s.charAt(j) < s.charAt(j + 1))) {
                    waviness++;
                }
            }
        }
        return waviness;
    }
}