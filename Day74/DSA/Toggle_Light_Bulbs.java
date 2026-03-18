Question:- https://leetcode.com/problems/toggle-light-bulbs/description/

Code:- 

class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        int state[] = new int[101];

        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i : bulbs)
        {
            state[i] = 1 - state[i];
        }

        for(int i = 1;i<=100;i++)
        {
            if(state[i] == 1)
            {
                result.add(i);
            }
        }

        return result;
    }
}