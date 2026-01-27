Code:- 

class Solution {
public:
    int countSeniors(vector<string>& details) {
        int age = 0;
        for (auto i : details) {
            if (stoi(i.substr(11, 2)) > 60)
                age++;
        }
        return age;
    }
};