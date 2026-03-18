Question:- https://leetcode.com/problems/toggle-light-bulbs/description/

Code:-

class Solution {
public:
    vector<int> toggleLightBulbs(vector<int>& bulbs) {

        vector<int> state(101,0);

        // toggle the switch
        for(int i : bulbs)
        {
            state[i] = 1 - state[i];
        }

        vector<int> result;
        for(int i = 1;i <= 100;i++)
        {
            if(state[i] == 1)
            {
                result.push_back(i);
            }
        }

        return result;
    }
};