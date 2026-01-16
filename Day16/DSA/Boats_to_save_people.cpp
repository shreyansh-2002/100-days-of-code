class Solution {
public:
    int numRescueBoats(vector<int>& people, int limit) {
        sort(people.begin(),people.end());

        int cnt = 0;

        int i = 0;   // light person
        int j = people.size() - 1;   // heavy person

        while (i <= j) {

            if (people[i] + people[j] <= limit) {
                i++;        //lightest person paired
            }

            j--;         //heavy person ko hta de 
            cnt++;
        }

        return cnt;
    }
};