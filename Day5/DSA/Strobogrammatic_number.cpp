#include <bits/stdc++.h>

using namespace std;

bool isStrobogrammatic(string str)
{
    unordered_map<int, int> map;

    map['0'] = '0';
    map['1'] = '1';
    map['8'] = '8';
    map['6'] = '9';
    map['9'] = '6';

    int left = 0;
    int right = str.length() - 1;

    while (left <= right)
    {
        char l = str[left];
        char r = str[right];

        if (map.find(l) == map.end() || map[l] != r)
        {
            return false;
        }

        left++;
        right--;
    }

    return true;
}
int main()
{
    string str;
    cout << "enter the number to check the number is " << endl;
    cin >> str;

    cout << (isStrobogrammatic(str) ? "true" : "false");
    return 0;
}
