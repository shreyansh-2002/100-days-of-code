Question:-  https://leetcode.com/problems/find-common-characters/description/?envType=problem-list-v2&envId=array

Code:-  

import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {

        int[] freq = new int[26];
        Arrays.fill(freq, Integer.MAX_VALUE);

        List<String> ans = new ArrayList<>();

        for(String word : words)
        {
            int[] temp = new int[26];

            for(char c : word.toCharArray())
            {
                temp[c - 'a']++;
            }

            for(int i = 0; i < 26; i++)
            {
                freq[i] = Math.min(freq[i], temp[i]);
            }
        }

        for(int i = 0; i < 26; i++)
        {
            while(freq[i]-- > 0)
            {
                ans.add(Character.toString((char)('a' + i)));
            }
        }

        return ans;
    }
}