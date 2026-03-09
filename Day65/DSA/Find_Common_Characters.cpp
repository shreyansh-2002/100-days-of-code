Question:-  https://leetcode.com/problems/find-common-characters/description/?envType=problem-list-v2&envId=array

Code:-

class Solution {
public:
    vector<string> commonChars(vector<string>& words) {

        vector<int> freq(26, INT_MAX);
        
        vector<string> ans;

        for(auto word : words)
        {
            vector<int> temp(26,0);

            for(char c : word)
            {
                temp[c-'a']++;
            }

            for(int i=0;i<26;i++)
            {
                freq[i] = min(freq[i],temp[i]);
            }
        }

        for(int i=0;i<26;i++)
        {
            while(freq[i]--)
            {
                ans.push_back(string(1,'a'+i));
            }
        }

        return ans;
    }
};