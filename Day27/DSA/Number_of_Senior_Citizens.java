Question:-  https://leetcode.com/problems/number-of-senior-citizens/description/

Code:- 

class Solution {
    public int countSeniors(String[] details) {
        int count  = 0;

        for(int i = 0;i<details.length;i++)
        {
            String age = details[i].substring(11,13);
            System.out.println(age);
            if(Integer.parseInt(age) > 60)
            {
                count++;
            }
        }

        return count;
    }
}