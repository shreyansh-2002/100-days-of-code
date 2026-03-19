Question:- https://leetcode.com/problems/first-element-with-unique-frequency/

Code:- 

class Solution {
    public int firstUniqueFreq(int[] nums) {
        
        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> freqCount = new HashMap<>();

        // Step 1: number -> frequency
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: frequency -> count
        for (int f : freq.values()) {
            freqCount.put(f, freqCount.getOrDefault(f, 0) + 1);
        }

        // Step 3: left to right scan
        for (int num : nums) {
            if (freqCount.get(freq.get(num)) == 1) {
                return num;
            }
        }

        return -1;
    }
}