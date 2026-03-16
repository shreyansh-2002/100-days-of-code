Question:- https://leetcode.com/problems/defanging-an-ip-address/description/

Code:-

class Solution {
public:
    string defangIPaddr(string address) {
        string newadd = "";
        for (int i = 0; i < address.length(); i++) {
            if (address[i] == '.')
                newadd += "[.]";
            else
                newadd += address[i];
        }
        return newadd;
    }
};