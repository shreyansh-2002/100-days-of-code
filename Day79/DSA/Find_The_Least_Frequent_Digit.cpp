Question:- https://leetcode.com/problems/find-the-least-frequent-digit/

Code:- 

    class Solution {
    public:
        int getLeastFrequentDigit(int n) {
            
            vector<int> freq(10,0);

            while(n > 0)
            {
                int digit = n % 10;
                freq[digit]++;
                n /= 10;
            }

            int minfreq = INT_MAX;

            int ans = 0;

            for(int d = 0;d<=9;d++)
            {
                if(freq[d] > 0)
                {
                    if(freq[d] < minfreq)
                    {
                        minfreq = freq[d];
                        ans = d;
                    }
                    else if(freq[d] == minfreq)
                    {
                        ans = min(d,ans);
                    }
                }
            }

            return ans;
        }
    };