Question:- https://leetcode.com/problems/boats-to-save-people/description/

Code:-  

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int cnt = 0;

        int i = 0;   // light person
        int j = people.length - 1;   // heavy person

        while (i <= j) {

            if (people[i] + people[j] <= limit) {
                i++;        //lightest person paired
            }

            j--;         //heavy person ko hta de 
            cnt++;
        }

        return cnt;
    }
}